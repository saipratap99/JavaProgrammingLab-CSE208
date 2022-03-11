/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaio;

import java.io.Console;

/**
 *
 * @author DELL
 */
public class ConsoleTextPassword {

    public static void main(String[] args) {
        Console c = System.console();

        System.out.print("Enter user name:");
        String s;
        s = c.readLine();

        System.out.print("Hello " + s + "!\nEnter your Password: ");
        char[] arr = c.readPassword();
        String psd = String.valueOf(arr);
        System.out.println("Your Password is: " + psd);
    }
}
