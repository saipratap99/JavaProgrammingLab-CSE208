/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package experiment_7;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class EncodingDecodingString {
    public static void main(String args[]){
        String str="";
        Scanner sc = new Scanner(System.in);
        int option = 1;
        while(option != 0){
            System.out.println("***********************************");
            System.out.printf("%-5s%-20s%5s%n", "***", "0.Exit", "***");
            System.out.printf("%-5s%-15s%5s%n", "***", "1.Encode", "***");
            System.out.printf("%-5s%-13s%5s%n", "***", "2.Decode", "***");
            System.out.printf("%-5s%-13s%5s%n", "***", "3.Upper Lower Revered", "***");
            System.out.println("***********************************");
            System.out.print("Choose option: ");
            option = Integer.parseInt(sc.nextLine());
            switch(option){
            case 1:
                System.out.print("Enter string to encode: ");
                str = sc.nextLine();
                for(int i=0;i<str.length();i++){
                    str = str.substring(0,i) + (char)((int)str.charAt(i) + 30) + str.substring(i+1);
                }
                System.out.println("Encoded string : " + str);
                break;
            case 2:
                System.out.print("Enter string to decode: ");
                str = sc.nextLine();
                for(int i=0;i<str.length();i++){
                    str = str.substring(0,i) + (char)((int)str.charAt(i) - 30) + str.substring(i+1);
                }
                System.out.println("Decoded string : " + str);
                break;
            case 3:
                System.out.print("Enter string to reverse case: ");
                str = sc.nextLine();
                for(int i=0;i<str.length();i++){
                    if ((int)str.charAt(i) > 64 && (int)str.charAt(i) < 91)
                        str = str.substring(0,i) + (char)((int)str.charAt(i) + 32) + str.substring(i+1);
                    else if((int)str.charAt(i) > 96 && (int)str.charAt(i) < 123)
                        str = str.substring(0,i) + (char)((int)str.charAt(i) - 32) + str.substring(i+1);
                }
                System.out.println("Revered case string : " + str);
                break;
            case 0:
                break;
            default:
                
            }
        }
    }
}
