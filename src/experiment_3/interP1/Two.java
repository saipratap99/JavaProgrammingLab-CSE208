/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package experiment_3.interP1;
import java.util.*;
import experiment_3.*;
/**
 *
 * @author DELL
 */
public class Two {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];
        System.out.println("Enter array elemnts: ");
        for(int i =0;i<10;i++)
            a[i] = sc.nextInt();
        Test t = new Test();
        t.max(a);
        one o = new one();
        System.out.println("Sum is : " + o.sum(a));
    }
}
