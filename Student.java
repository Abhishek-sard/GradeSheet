// /*student=> subject => marks => total and percentage */

import java.util.Scanner;

class Student {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the marks of math, java, sad, dsa, web");

        double mathMark = scanner.nextDouble();
        double javaMark = scanner.nextDouble();
        double sadMark = scanner.nextDouble();
        double dsaMark = scanner.nextDouble();
        double webMark = scanner.nextDouble();

        double totalMarks = calculateTotalMarks(mathMark, javaMark, sadMark, dsaMark, webMark);
        double percentage = calculatePercentage(totalMarks);

        System.out.println("Total marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");

        scanner.close();
    }

    public static double calculateTotalMarks(double mathMark, double javaMark, double sadMark, double dsaMark, double webMark) {
        return mathMark + javaMark + sadMark + dsaMark + webMark;
    }

    public static double calculatePercentage(double totalMarks) {
        final int MAX_MARKS = 500; // Assuming each subject has maximum 100 marks
        return (totalMarks / MAX_MARKS) * 100;
    }
}
