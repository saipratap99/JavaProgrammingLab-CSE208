/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaio;
import java.io.FileInputStream;
import java.io.IOException;
/**
 *
 * @author DELL
 */
public class BasicFileInputStream {
    public static void main(String[] args){
        // reafing all charecters from the file
        try{
        FileInputStream fin = new FileInputStream("firstFile.txt");
        // ascii number of a charecter
        int i;
        while((i = fin.read())!= -1){
            System.out.print((char)i);
        }
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
