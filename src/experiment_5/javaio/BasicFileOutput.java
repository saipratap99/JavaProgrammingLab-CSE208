/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaio;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author DELL
 */

// writing output to the file

public class BasicFileOutput {
  public static void main(String[] args) {
        try {
            FileOutputStream fout = new FileOutputStream("firstFile.txt");
            // writing a byte 
             fout.write(65);
            // 65 -> A
            
            // writing string to file
            String str = "\nSai Pratap 99 ";
            // converting to array of bytes 
            byte b[] = str.getBytes();
            fout.write(b);
            System.out.println("Sucess!");
            
            
        } catch (IOException e) {
            System.out.println("File not found");
        }
    }
  
}
