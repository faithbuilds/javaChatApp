/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.progpoe;

/**
 *
 * @author faith
 */
import java.util.Scanner;

class Login {
    private String firstName; 
    private String lastName; 
    private String username;
    private String password;
    private String cellphone;
    
    private String enteredUsername;
    private String enteredPassword;
    
    private boolean isLoggedIn = false;
    
    //set registration details
    public void registerDetails(String firstName, String lastName, String username, String password, String cellphone) {
       this.firstName = firstName;
       this.lastName = lastName;
       this.username = username;
       this.password = password;
       this.cellphone = cellphone;
    }
    
   //check username: contains "_" and max 5 char
    public boolean checkUserName(){
        return username.contains("_")&& username.length() <=5;
    }
    
    //check password: at least 8 char, capital letter, number, special char
    public boolean checkPasswordComplexity(){
        boolean hasUpper = false;
        boolean hasDigit = false;
        boolean hasSpecial = false; 
        if (password.length() <8) return false;
        
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) hasUpper = true;
            else if (Character.isDigit(c)) hasDigit = true;
            else if (!Character.isLetterOrDigit(c)) hasSpecial = true;
        }
        
        return hasUpper && hasDigit && hasSpecial;
    }
    
    //check cellphone: Startd with +27 and followed by 9 digits
    public boolean checkCellPhoneNumber(){
        return cellphone.matches("^\\+27\\d{9}$");
    }
    
    //Register user
    public String registerUser() {
        if (!checkUserName()) {
            return "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters long.";
        }
        if (!checkPasswordComplexity()) {
            return "Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character.";   
        }
        if (!checkCellPhoneNumber()) {
            return "Cellphone number incorrectly formatted or does not contain international code.";
        }
        return "User registered successfully.";
    }
    
    //Login user
     public boolean loginUser(String enteredUsername, String enteredPassword) {
        this.enteredUsername = enteredUsername;
        this.enteredPassword = enteredPassword;
        isLoggedIn = this.username.equals(enteredUsername) && this.password.equals(enteredPassword);
        return isLoggedIn;
     }
     
     //return login status message
     public String returnLoginStatus() {
        if (isLoggedIn) {
            return "Welcome " + firstName + " " + lastName + ", it's great to see you again.";
        } else {
            return "Username or password is incorrect, please try again.";
        }
    }
}
     
