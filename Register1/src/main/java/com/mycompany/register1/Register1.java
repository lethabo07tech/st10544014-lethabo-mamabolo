/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.register1;

import java.util.Scanner;

/**
 *
 * @author letha
 */
public class Register1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Creating an object for the Login class
        // The main class uses account to call Login methods
        Login account = new Login();

        // Create a new account
        // First name
        System.out.println("Register a new account");
        System.out.print("Enter your First Name: ");
        String firstName = input.nextLine();

        // Last name
        System.out.print("Enter your Last Name: ");
        String lastName = input.nextLine();

        // Username
        System.out.print("Enter your Username (must contain an underscore and be 5 or less in characters): ");
        String username = input.nextLine();

        // Cell phone number
        System.out.print("Enter your Cell Phone Number (should start with +27 and have 9 digits after it): ");
        String cellPhone = input.nextLine();

        // Password
        System.out.print("Enter your Password (must include uppercase, lowercase, special character, and a number): ");
        String password = input.nextLine();

        // Send registration details to the Login class
        // Store the returned registration message
        String registrationMessage =
                account.registerUser(username, password, cellPhone, firstName, lastName);

        // Display the registration result
        System.out.println(registrationMessage);

        // Only continue if registration was successful
        if (registrationMessage.equals("Account successfully registered")) {

            // Login to the registered account
            System.out.println("Login to your account");

            // Ask for the login username
            System.out.print("Enter your Username: ");
            String loginUsername = input.nextLine();

            // Ask for the login password
            System.out.print("Enter your Password: ");
            String loginPassword = input.nextLine();

            // Send login details to the Login class
            account.loginUser(loginUsername, loginPassword);

            // Display the login result
            System.out.println(account.returnLoginStatus());
        }

        // Close the scanner after all input is finished
        input.close();
    }
}
