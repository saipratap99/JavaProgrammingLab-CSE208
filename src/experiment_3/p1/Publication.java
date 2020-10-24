/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package experiment_3.p1;

import java.util.*;

/**
 *
 * @author DELL
 */
public class Publication {
    String title;
    float price;
    public void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Title: ");
        title = sc.nextLine();
        System.out.print("Enter Price: ");
        price = sc.nextFloat();
    }

    public void putData() {
        System.out.println("Title : " + title);
        System.out.println("Price : " + price);
    }
}
