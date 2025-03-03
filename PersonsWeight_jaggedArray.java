package assignment4_arrays;

import java.util.Scanner;

public class PersonsWeight_jaggedArray {
    static int[][] weights;  // Jagged array
    static int[] weightCount; // Stores the number of weights for each person
    static Scanner sc = new Scanner(System.in);

    // Function to initialize the jagged array
    public static void initializeWeights(int N) {
        weights = new int[N][];  
        weightCount = new int[N]; // Keep track of the number of weights

        for (int i = 0; i < N; i++) {
            System.out.print("Enter number of weights for person " + (i + 1) + ": ");
            weightCount[i] = sc.nextInt();  // Store count of weights
            weights[i] = new int[weightCount[i]]; // Initialize person's weight list

            System.out.println("Enter weights for person " + (i + 1) + ": ");
            for (int j = 0; j < weightCount[i]; j++) {
                weights[i][j] = sc.nextInt();
            }
        }
    }

    // Function to add a weight manually (without ArrayList)
    public static void enterWeight(int personIndex, int newWeight) {
        if (personIndex < 0 || personIndex >= weights.length) {
            System.out.println("Invalid person index.");
            return;
        }

        // Create a new array with one extra space
        int newSize = weightCount[personIndex] + 1;
        int[] newWeights = new int[newSize];

        // Copy existing weights manually
        for (int i = 0; i < weightCount[personIndex]; i++) {
            newWeights[i] = weights[personIndex][i];
        }

        // Add the new weight
        newWeights[newSize - 1] = newWeight;

        // Update references
        weights[personIndex] = newWeights;
        weightCount[personIndex]++; // Increase weight count

        System.out.println("Weight added successfully.");
    }

    // Function to find the minimum weight of a person
    public static int getMinimumWeight(int personIndex) {
        if (personIndex < 0 || personIndex >= weights.length || weightCount[personIndex] == 0) {
            System.out.println("Invalid person index or no weights recorded.");
            return -1;
        }

        int minWeight = weights[personIndex][0]; // Assume first weight is the smallest

        // Loop manually to find the minimum
        for (int i = 1; i < weightCount[personIndex]; i++) {
            if (weights[personIndex][i] < minWeight) {
                minWeight = weights[personIndex][i];
            }
        }

        return minWeight;
    }

    // Function to display weights
    public static void displayWeights() {
        System.out.println("\nCurrent Weights Data:");
        for (int i = 0; i < weights.length; i++) {
            System.out.print("Person " + (i + 1) + ": ");
            for (int j = 0; j < weightCount[i]; j++) {
                System.out.print(weights[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter number of persons: ");
        int N = sc.nextInt();
        initializeWeights(N);

        // Display initial weights
        displayWeights();

        // Add a new weight
        System.out.print("\nEnter person index to add weight (1 to N): ");
        int personIndex = sc.nextInt() - 1;
        System.out.print("Enter new weight: ");
        int newWeight = sc.nextInt();
        enterWeight(personIndex, newWeight);

        // Display updated weights
        displayWeights();

        // Find minimum weight
        System.out.print("\nEnter person index to get minimum weight (1 to N): ");
        int minPersonIndex = sc.nextInt() - 1;
        int minWeight = getMinimumWeight(minPersonIndex);
        if (minWeight != -1) {
            System.out.println("Minimum weight of person " + (minPersonIndex + 1) + " is: " + minWeight);
        }
    }
}

