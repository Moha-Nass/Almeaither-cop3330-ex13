package org.example;

import java.util.Scanner;

/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Mohammed_Almeaither
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println("Exercise 13 - Determining Compound Interest");

        int nn;
        double pp,ii, tt,AA,rr;
        System.out.print("What is the principal amount: ");
        Scanner in = new Scanner(System.in);
        pp = Double.parseDouble(in.next());

        System.out.print("Enter the rate of interest: ");
        ii = Double.parseDouble(in.next());

        rr = ii/100.0;
        System.out.print("Enter the number of years: ");
        tt = Double.parseDouble(in.next());

        System.out.print("What is the number of times the interest is compounded per year? ");
        nn = in.nextInt();
        AA = pp *Math.pow((1+rr/nn), nn*tt);

        System.out.print("$" + pp + " invested at "+ii + "% for "+tt + "years compunded "+ nn + " times per year is $"+Math.round(AA*100.0)/100.0);


    }
}
