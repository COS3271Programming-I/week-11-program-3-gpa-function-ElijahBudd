package myProjects;
import java.util.Scanner;

public class GPA_Function {
	// Computes a weighted GPA from parallel arrays
	static double computeGPA (double [] grades, double [] credits) {
		double weightedSum = 0;
		double totalCredits = 0;
		
		for (int i = 0; i < grades.length; i++) {
			weightedSum += grades[i] * credits[i];
			totalCredits += credits[i];
		}
		
		// acoid division by zero if all credits are 0
		return totalCredits == 0 ? 0 : weightedSum / totalCredits;
	}
	
	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);
		
		// Get number of courses
		System.out.print("Enter number of courses: ");
		int numCourses = userinput.nextInt();
		
		// parallel arrays to hold grades and credits for each course
		double[] grades = new double[numCourses];
		double[] credits = new double[numCourses];
		
		// Collect grade and credit data
		for (int i = 0; i < numCourses; i++) {
			System.out.print("Enter course " + (i + 1) + " grade (0.0 - 4.0): ");
			grades[i] = userinput.nextDouble();
			System.out.print("Enter course " + (i + 1) + " credits: ");
			credits[i] = userinput.nextDouble();
		}
		
		// Compute and display the GPA rounded
		double gpa = computeGPA(grades, credits);
		System.out.printf("%nGPA: %.2f%n", gpa);
		
		userinput.close();
	}
}
