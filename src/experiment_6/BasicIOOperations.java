/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package experiment_6;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class BasicIOOperations {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            FileWriter fout = new FileWriter("data.txt");
            FileWriter f1 = new FileWriter("even.txt");
            FileWriter f2 = new FileWriter("odd.txt");
            System.out.println("Enter the number(enter -1 to stop giving input): ");
            int a;
            do{
                a = sc.nextInt();
                if(a!=-1)
                   fout.write(String.valueOf(a) + "\n");
            }while(a!=-1);
            fout.close();
            FileReader fin = new FileReader("data.txt");
            int i;
            while((i=fin.read()) != -1){
                String s = "";
                s = s + (char)i;
                while((i=fin.read())!= 10){
                    s =s + String.valueOf((char)i);
                }
                int num = Integer.parseInt(s);
                if(num%2 == 0){
                    f1.write(s+"\n");
                }else{
                    f2.write(s+"\n");
                }
                    
            }
            f1.close();
            f2.close();
        } catch (IOException e) {
            System.out.println("File not found" + e.getMessage());
        }
    }
}
