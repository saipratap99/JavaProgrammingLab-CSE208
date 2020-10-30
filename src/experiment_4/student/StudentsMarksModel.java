/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package experiment_4.student;
import java.util.*;
/**
 *
 * @author DELL
 */
public class StudentsMarksModel {
    String name;
    int marks[] = new int[6];
    int total;
    float percentage;
    public void getMarksData() throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student name: ");
        name = sc.nextLine();
        for(int i=0;i<6;i++){
           int mark;
           System.out.println("Enter subject " + i + " marks: ");
           mark = sc.nextInt();
           if(mark >= 0 && mark <= 100 )
                marks[i] = mark; 
           else
                throw new RangeException("Must be in between 0 and 100!");
        }
    }
    public void calPercentage(){
        for(int i : marks)
            total += i;
        percentage = total/6;
        System.out.println("Name: " + name + "\nTotal: " + total + "\nPercantage: " + percentage);
    }
}
