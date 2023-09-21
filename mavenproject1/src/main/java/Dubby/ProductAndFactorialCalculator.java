/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dubby;

/**
 *
 * @author kumar
 */
import java.util.Scanner;

public class ProductAndFactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Product and Factorial Calculator");
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        int product = num1 * num2;

        System.out.println("Product of " + num1 + " and " + num2 + " is: " + product);

        System.out.print("Enter a number to calculate its factorial: ");
        int numToFactorial = scanner.nextInt();

        long factorial = calculateFactorial(numToFactorial);

        System.out.println("Factorial of " + numToFactorial + " is: " + factorial);

        scanner.close();
    }

    private static long calculateFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        if (n == 0 || n == 1) {
            return 1;
        } else {
            long result = 1;
            for (int i = 2; i <= n; i++) {
                result *= i;
            }
            return result;
        }
    }
}

