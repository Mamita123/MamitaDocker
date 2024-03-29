package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user for their name
        System.out.print("Please enter your name: ");
        String userName = scanner.nextLine();

        // Create an instance of the User class with the provided name
        MamitaDocker user = new MamitaDocker(userName);

        // Call the userNameDisplay method
        user.mamitaDockerNameDisplay();

        // Close the scanner
        scanner.close();
    }
}
