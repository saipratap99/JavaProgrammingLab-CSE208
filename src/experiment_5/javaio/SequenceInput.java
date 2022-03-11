/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

/**
 *
 * @author DELL
 */
// ******************************************************************************************
// The SequenceInputStream is used to read data from multiple streams one by one sequentially
// ******************************************************************************************
public class SequenceInput {

    public static void main(String[] args) {
        try {
            FileOutputStream fout = new FileOutputStream("secondFile.txt");
            String s = "\nElectriacl Engnieer";
            byte b[] = s.getBytes();
            fout.write(b);
            fout.close();
        } catch (Exception e) {
            System.err.println("File doesnt exsist");
        }
        try {
            FileInputStream f1 = new FileInputStream("firstFile.txt");
            FileInputStream f2 = new FileInputStream("secondFile.txt");
            SequenceInputStream s = new SequenceInputStream(f1, f2);
            int i;
            while((i=s.read()) != -1){
                System.out.print((char)i);
            }
            f1.close();
            f2.close();
            s.close();
        } catch (Exception e) {
            System.err.println("File doesnt exsist");
        }

    }
}
