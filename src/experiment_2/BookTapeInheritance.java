/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package experiment_2;

import java.util.*;

/**
 *
 * @author DELL
 *
 */
class Publication {

    private String title;
    private float price;

    void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Title: ");
        title = sc.nextLine();
        System.out.print("Enter Price: ");
        price = sc.nextFloat();
    }

    void putData() {
        System.out.println("Title : " + title);
        System.out.println("Price : " + price);
    }
}

class Book extends Publication {

    private int pageCount;

    @Override
    void getData() {
        super.getData();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Page count: ");
        pageCount = sc.nextInt();
    }

    @Override
    void putData() {
        super.putData();
        System.out.println("Page Count: " + pageCount);
    }
}

class Tape extends Publication {

    private float playTime;

    @Override
    void getData() {
        super.getData();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Play time: ");
        playTime = sc.nextFloat();
    }

    @Override
    void putData() {
        super.putData();
        System.out.println("Play Time: " + playTime);
    }
}

public class BookTapeInheritance {

    public static void main(String args[]) {
        Book[] b;
        b = new Book[5];
        Tape[] t;
        t = new Tape[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("*******Enter datails of Publication " + (i+1) +" ********");
            b[i] = new Book();
            b[i].getData();
            t[i] = new Tape();
            t[i].getData();
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("*******   " + (i+1) +"   ********");
            b[i].putData();
            t[i].putData();
        }
        
    }

}
