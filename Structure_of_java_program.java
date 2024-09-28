// Documentation

// Package is optional

import java.util.Scanner;           // Imports the Scanner

// Interface is optional

// Class Defination
class Structure_of_java_program
{
    // Main method
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int No = sobj.nextInt();

        System.out.print("Number is : "+No);
    }
}