package com.company;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Sean McCormack
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("What is the password? ");
        String input = scan.nextLine();
        String password = "abc$123";
        if(password.equals(input)){
            System.out.println("Welcome!");
        }else{
            System.out.println("I don't know you.");
        }
	// write your code here
    }
}
