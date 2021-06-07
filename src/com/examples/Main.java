package com.examples;

import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Jesus Rodriguez
 */
public class Main {

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);

        int Length;
        System.out.print("What is the length of the room in feet? ");
            Length = myObj.nextInt();

        int Width;
        System.out.print("What is the width of the room in feet? ");
            Width = myObj.nextInt();

        int SquareFeet = Width * Length;
        double SquareMeter = SquareFeet * 0.09290304;

        System.out.println("You entered dimensions of " + Length + " feet by " + Width + " feet ");
        System.out.println("The area is ");
        System.out.println(SquareFeet + " square feet");
        System.out.println(SquareMeter + " square meter");

    }
}
