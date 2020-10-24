/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package experiment_3.p2;
import experiment_3.p1.*;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class Tape extends Publication{
    float playTime;
    @Override
    public void getData() {
        super.getData();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Play time: ");
        playTime = sc.nextFloat();
    }

    @Override
    public void putData() {
        super.putData();
        System.out.println("Play Time: " + playTime);
    }
}
