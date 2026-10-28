package com.pluralsight;

import java.util.Scanner;

public class StringBuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //scanner

        java.lang.StringBuilder address = new java.lang.StringBuilder();

        System.out.print("Please provide the following information:\n");
        System.out.print("Full name: ");
        String fullName = scanner.nextLine();

        //asked the question to
        System.out.print("Enter Billing Street: ");
        String street = scanner.nextLine();

        System.out.print("Enter Billing City: ");
        String city = scanner.nextLine();

        System.out.print("Enter Billing State: ");
        String state = scanner.nextLine();

        System.out.print("Enter Billing Zip: ");
        String zip = scanner.nextLine();


        System.out.println(fullName + '\n'); //sout the name

        //adds the address to the string builder.
        address.append( "Billing Street: ").append(street).append("\n");
        address.append(city);
        address.append(state);
        address.append(zip);

    }
}
