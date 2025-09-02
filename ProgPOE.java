/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.progpoe;

/**
 *
 * @author faith
 */
import java.util.Scanner;

public class ProgPOE {  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Login login = new Login();
        
        //---Registration---
        
        System.out.println("=== Register ===");

        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        System.out.print("Enter cellphone number (+27...): ");
        String cellphone = scanner.nextLine();
        
         login.registerDetails(firstName, lastName, username, password, cellphone);
        System.out.println(login.registerUser());
        
        //----LOGIN PHASE---
        System.out.println("\n--- LOGIN ---");
        
        System.out.print("Enter your username: ");
        String loginUser = scanner.nextLine();
        
        System.out.print("Enter your password: ");
        String loginPass = scanner.nextLine(); 
        
        login.loginUser(loginUser, loginPass);
        System.out.println(login.returnLoginStatus());
        
        scanner.close();
    }
}
