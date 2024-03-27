import java.util.Scanner;

public class Formula{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking input for the two numbers
        System.out.print("Enter the first number (a): ");
        double a = scanner.nextDouble();
        System.out.print("Enter the second number (b): ");
        double b = scanner.nextDouble();
        
        // Calculating the square of the sum using the formula (a + b)^2
        double result = Math.pow((a + b), 2);
        double difference = Math.pow((a - b), 2);
        double productDifference = (Math.pow(a, 2) * Math.pow(b, 2)) - (2 * a * b);
        
        // Displaying the result
        System.out.println("The square of the sum of " + a + " and " + b + " is: " + result);
        System.out.println("The square of the difference of " + a + " and " + b + " is: " + difference);
        System.out.println("The result of a^2 * b^2 - 2ab is: " + productDifference);
        
        scanner.close();
    }
}
