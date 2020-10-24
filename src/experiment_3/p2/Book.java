/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package experiment_3.p2;

import java.util.Scanner;
import experiment_3.p1.*;

/**
 *
 * @author DELL
 */
public class Book extends Publication{
    int page_count;
    @Override
    public void getData() {
        super.getData();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Page count: ");
        page_count = sc.nextInt();
    }

    @Override
    public void putData() {
        super.putData();
        System.out.println("Page Count: " + page_count);
    }
}
