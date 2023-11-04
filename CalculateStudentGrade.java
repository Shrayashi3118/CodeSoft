import java.util.Scanner;

public class CalculateStudentGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int numSub = scanner.nextInt();
        double totalMarks = 0.0;
        for (int i = 1; i <= numSub; i++) {
            System.out.print("Enter marks for subject " + i + " (out of 100): ");
            double subjectMarks = scanner.nextDouble();
            totalMarks += subjectMarks;
        }
        double avgPercentage = (totalMarks / (numSub * 100)) * 100;
        String grade;
        if (avgPercentage >= 90) {
            grade = "A+";
        } else if (avgPercentage >= 80) {
            grade = "A";
        } else if (avgPercentage >= 70) {
            grade = "B";
        } else if (avgPercentage >= 60) {
            grade = "C";
        } else if (avgPercentage >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }

        // Display results
        System.out.println("Total Marks: " + totalMarks);
        System.out.printf("Average Percentage: %.2f%%\n", avgPercentage);
        System.out.println("Grade: " + grade);
        scanner.close();
    }
}
