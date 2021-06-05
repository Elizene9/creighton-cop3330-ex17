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
import java.util.Scanner;

public class ex17 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner inp = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        Scanner Alc = new Scanner(System.in);
        double weight = 0;
        System.out.print("What is your weight in pounds? ");
           do {
               try {
                   weight = input.nextDouble();
                   break;
               } catch (InputMismatchException e) {
                   System.out.println("\nInvalid input\nEnter a valid numeric value");
                   input.next();
               }
           } while (!(input.hasNextDouble()));

        System.out.print("\nEnter the adr for your gender, .73 for males and .66 for females: ");
        double gender = 0;
        do {
            try {
                gender = in.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("\nInvalid input\nEnter a valid numeric value");
                in.next();
            }
        } while (!(in.hasNextDouble()));

        System.out.print("\nWhat is total amount of alcohol consumed in ounces? ");
        double alc = 0;
        do {
            try {
                alc = Alc.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("\nInvalid input\nEnter a valid numeric value");
                Alc.next();
            }
        } while (!(Alc.hasNextDouble()));

        System.out.print("\nHow many hours since last drink? ");
        int time = 0;
        do {
            try {
                time = inp.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("\nInvalid input\nEnter a valid numeric value");
                inp.next();
            }
        } while (!(inp.hasNextInt()));
        double BAC = (alc * 5.14 / weight * gender) - .15 * time;

        if (BAC >= .08)
            System.out.printf("\nYour BAC is %.2f\nIt's not legal for you to drive.", BAC);

        else if (BAC < .08 && BAC > 0)
            System.out.printf("\nYour BAC is %.2f\nIt's legal for you to drive.", BAC);

        else
            System.out.print("\nYour BAC is 0\nIt's legal for you to drive.");
    }
}
