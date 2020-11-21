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
public class WordsLettersLines {

    public static void main(String args[]) {
        String str = "";
        Scanner sc = new Scanner(System.in);
        int option = 1;
        while (option != 0) {
            System.out.println("***********************************");
            System.out.printf("%-5s%-20s%5s%n", "***", "0.Exit", "***");
            System.out.printf("%-5s%-15s%5s%n", "***", "1.Vowels", "***");
            System.out.printf("%-5s%-5s%5s%n", "***", "2.Number of Charecters,spaces,Words and Lines", "***");
            System.out.println("***********************************");
            System.out.print("Choose option: ");
            option = Integer.parseInt(sc.nextLine());
            switch (option) {
                case 1:
                    System.out.print("Enter string to find vowels: ");
                    str = sc.nextLine();
                    int Vowelscount = 0;
                    System.out.print("Vowels in the string are: ");
                    for (int i = 0; i < str.length(); i++) {
                        char c;
                        c = str.charAt(i);
                        if (c == 'a' || c == 'A') {
                            Vowelscount++;
                            System.out.print(str.charAt(i) + " ");
                        } else if (c == 'e' || c == 'E') {
                            Vowelscount++;
                            System.out.print(str.charAt(i) + " ");
                        } else if (c == 'i' || c == 'I') {
                            Vowelscount++;
                            System.out.print(str.charAt(i) + " ");
                        } else if (c == 'o' || c == 'O') {
                            Vowelscount++;
                            System.out.print(str.charAt(i) + " ");
                        } else if (c == 'u' || c == 'U') {
                            Vowelscount++;
                            System.out.print(str.charAt(i) + " ");
                        }
                    }
                    System.out.println("\nCount of Vowels in the String: " + Vowelscount);
                case 2:
                    System.out.print("Enter string to find number of charecters,spaces words and lines: ");
                    str = sc.nextLine();
                    int charsCount = str.length();
                    int wordsCount = charsCount == 0 ? 0 : 1;
                    int linesCount = charsCount == 0 ? 0 : 1;
                    for (int i = 0; i < str.length(); i++) {
                        if(str.charAt(i) == ' ')
                            wordsCount++;
                        else if(str.charAt(i) == '\n')
                            linesCount++; 
                    }
                    System.out.println("Letters count: " + charsCount);
                    System.out.println("Words count: " + wordsCount);
                    System.out.println("Spaces Count: " + (wordsCount - 1));
                    System.out.println("Lines Count: " + linesCount);
                    break;
                case 0:
                    System.out.println("*** Thank You! ***");
                    break;
                default:
                    System.out.println("!!! Please choose from available options !!!");

            }
        }
    }
}
