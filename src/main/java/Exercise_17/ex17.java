/*
* UCF COP 3330 Summer 2021 Assignment 1 Solutions
* Copyright 2021 Charlene Creighton
 */

/*
Create a program that prompts for your weight, gender, total alcohol consumed
 (in ounces), and the amount of time since your last drink.
 Calculate your blood alcohol content (BAC) using this formula

BAC = (A × 5.14 / W × r) − .015 × H where
A is total alcohol consumed, in ounces (oz).
W is body weight in pounds.
r is the alcohol distribution ratio:
0.73 for men
0.66 for women
H is number of hours since the last drink.
Display whether or not it’s legal to drive by
comparing the blood alcohol content to 0.08.

Example Output
Your BAC is 0.08
It is not legal for you to drive.

Constraint
Prevent the user from entering non-numeric values.
 */
package Exercise_17;
import java.util.InputMismatchException;
import java.util.*;
import java.util.Scanner;

public class ex17 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("What is your weight in pounds? ");

        double weight = ex_17();

        System.out.print("\nEnter the adr for your gender, .73 for males and .66 for females: ");
        double gender = ex_17();


        System.out.print("\nWhat is total amount of alcohol consumed in ounces? ");
        double alc = ex_17();

        System.out.print("\nHow many hours since last drink? ");
        double time = ex_17();

        double BAC = (alc * 5.14 / weight * gender) - .015 * time;

        if (BAC >= .08)
            System.out.printf("\nYour BAC is %.2f\nIt's not legal for you to drive.", BAC);

        else if (BAC < .08 && BAC > 0)
            System.out.printf("\nYour BAC is %.2f\nIt's legal for you to drive.", BAC);

        else
            System.out.printf("\nYour BAC is %.2f\nIt's legal for you to drive.", BAC);
    }


public static double ex_17() {

    while (true) {

        try {
            return input.nextDouble();
        }
        catch (InputMismatchException e) {
            input.next();
            System.out.println("\nInvalid input, enter a numeric value");
        }
    }
}
}