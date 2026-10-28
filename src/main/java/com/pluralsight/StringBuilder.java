package com.pluralsight;

import java.util.Scanner;

public class StringBuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //scanner

        java.lang.StringBuilder address = new java.lang.StringBuilder();

        System.out.print("Please provide the following information:\n");
        System.out.print("Full name: ");
        String fullName = scanner.nextLine();

        //asked the question to the user.
        System.out.print("Enter Billing Street: ");
        String billingStreet = scanner.nextLine();

        System.out.print("Enter Billing City: ");
        String billingCity = scanner.nextLine();

        System.out.print("Enter Billing State: ");
        String billingState = scanner.nextLine();

        System.out.print("Enter Billing Zip: ");
        String billingzip = scanner.nextLine();

        //adds the address to the string builder.
        address.append("Billing address:\n");
        address.append(billingStreet).append("\n");
        address.append(billingCity).append(",").append(" ");
        address.append(billingState).append(" ");
        address.append(billingzip).append("\n\n");

        //asks question about the shipping address.
        System.out.print("\nEnter Shipping  Street: ");
        String shippingStreet = scanner.nextLine();

        System.out.print("Enter Shipping  City: ");
        String shippingCity = scanner.nextLine();

        System.out.print("Enter Shipping  State: ");
        String shippingState = scanner.nextLine();

        System.out.print("Enter Shipping  Zip: ");
        String shippingZip = scanner.nextLine();

        //adds the shipping address to the string builder.
        address.append("Shipping address:\n");
        address.append(shippingStreet).append("\n");
        address.append(shippingCity).append(",").append(" ");
        address.append(shippingState).append(" ");
        address.append(shippingZip);

        //sout the final output
        System.out.println(" ");
        System.out.println(fullName + "\n");
        System.out.println(address);
    }
}


