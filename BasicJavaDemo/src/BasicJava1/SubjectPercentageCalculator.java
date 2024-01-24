package BasicJava1;

import java.util.Scanner;

public class SubjectPercentageCalculator {

	    // Method to calculate individual subject percentage
	    public static double calculateSubjectPercentage(double obtainedMarks, double totalMarks) {
	        if (totalMarks == 0) {
	            throw new IllegalArgumentException("Total marks for a subject cannot be zero.");
	        }

	        return (obtainedMarks / totalMarks) * 100;
	    }

	    // Method to calculate total percentage
	    public static double calculateTotalPercentage(double[] subjectPercentages) {
	        double totalPercentage = 0;

	        for (double subjectPercentage : subjectPercentages) {
	            totalPercentage += subjectPercentage;
	        }

	        return totalPercentage / subjectPercentages.length;
	    }

	    // Main method for testing
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Example for three subjects
	        int numberOfSubjects = 3;
	        double[] subjectPercentages = new double[numberOfSubjects];

	        // Input marks for each subject
	        for (int i = 0; i < numberOfSubjects; i++) {
	            System.out.print("Enter marks obtained for subject " + (i + 1) + ": ");
	            double obtainedMarks = scanner.nextDouble();

	            System.out.print("Enter total marks for subject " + (i + 1) + ": ");
	            double totalMarks = scanner.nextDouble();

	            // Calculate and store the percentage for each subject
	            subjectPercentages[i] = calculateSubjectPercentage(obtainedMarks, totalMarks);
	        }

	        // Calculate total percentage
	        double totalPercentage = calculateTotalPercentage(subjectPercentages);

	        // Display individual subject percentages
	        System.out.println("\nSubject-wise Percentages:");
	        for (int i = 0; i < numberOfSubjects; i++) {
	            System.out.println("Subject " + (i + 1) + ": " + subjectPercentages[i] + "%");
	        }

	        // Display total percentage
	        System.out.println("\nTotal Percentage: " + totalPercentage + "%");

	        // Close the scanner
	        scanner.close();
	    }
	}



