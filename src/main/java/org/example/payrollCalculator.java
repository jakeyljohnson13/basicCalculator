package org.example;
import java.util.Scanner;

public class payrollCalculator {
    Scanner scan = new Scanner(System.in);

    String name = scan.nextLine();
    float hours = scan.nextFloat();

    float rate = scan.nextFloat();

    float result = hours * rate;

    String gross = String.format("%.2f", result);

}
