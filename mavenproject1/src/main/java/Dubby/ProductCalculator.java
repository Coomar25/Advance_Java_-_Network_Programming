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

public class ProductCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Product Calculator");
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        int product = num1 * num2;

        System.out.println("Product of " + num1 + " and " + num2 + " is: " + product);

        scanner.close();
    }
}
