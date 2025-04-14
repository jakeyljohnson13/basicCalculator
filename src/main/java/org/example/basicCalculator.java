package org.example;
import java.util.Scanner;

public class basicCalculator{
    public void calculate()

    {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        float num1 = s.nextFloat();

        System.out.println("Enter the second number: ");
        float num2 = s.nextFloat();
        s.nextLine();

        System.out.println("Now what you like to do?");
        System.out.println("A");
        System.out.println("S");
        System.out.println("M");
        System.out.println("D");

        String action = s.nextLine();

        if (action.equals("M")) {
            float product = num1 * num2;
            System.out.println("The product is " + String.format("%.2f", product));
        } else if (action.equals("A")) {
            float sum = num1 + num2;
            System.out.println("The sum is " + String.format("%.2f", sum));

        } else if (action.equals("S")) {
            float difference = num1 - num2;
            System.out.println("The difference is " + String.format("%.2f", difference));
        } else if (action.equals("D")) {
            float quotient = num1 / num2;
            System.out.println("The quotient is " + String.format("%.2f", quotient));
        } else {
            System.out.println("Invalid input. Rerun program.");
        }
    }

}

