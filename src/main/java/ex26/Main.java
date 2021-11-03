/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution, Exercise 26
 *  Copyright 2021 Mayank Goyal
 */

package ex26;

import java.util.Scanner;
import java.lang.Math;
import java.util.Formatter;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your balance? ");
        double balance = scanner.nextDouble();

        System.out.print("What is the APR on the card (as a percent)? ");
        double apr = scanner.nextDouble();

        System.out.print("What is the monthly payment you can make? ");
        double mPayment = scanner.nextDouble();

        int months = getMonths(balance, apr, mPayment);

        System.out.print("It will take you " +  months + " months to pay off this card. ");
    }

    static int getMonths(double balance, double apr, double mPayment) {
        apr /= 36500;

        double dmonths = (-1/30.0) * Math.log(1 + ((balance / mPayment) * (1 - (Math.pow((1 + apr), 30)))))/Math.log(1 + apr);

        double decimalPart = dmonths - (int) dmonths;

        if(decimalPart > 0)
        {
            dmonths = dmonths + 0.5;
        }

        int months = (int) Math.rint(dmonths);
        return months;
    }
}
