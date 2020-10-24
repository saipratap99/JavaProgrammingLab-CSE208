/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package experiment_3;
import experiment_3.p1.*;
import experiment_3.p2.*;
/**
 *
 * @author DELL
 */
public class BookTapePackage {
    public static void main(String[] args){
        Book b = new Book();
        Tape p = new Tape();
        
        b.getData();
        p.getData();
        System.out.println("***********Entered data************");
        b.putData();
        p.putData();
    }
}
