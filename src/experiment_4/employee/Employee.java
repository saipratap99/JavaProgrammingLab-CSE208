/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package experiment_4.employee;
import java.util.*;
/**
 *
 * @author DELL
 */
public class Employee {
    int empid;
    String empName;
    int age;
    
    public void addEmployee()throws Exception{
        int id,agee;
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter new employee id: ");
        id = sc.nextInt();
        System.out.println("employee name: ");
        name = sc.next();
        System.out.println("employee age: ");
        agee = sc.nextInt();
        empid = id;
        empName = name;
        if(agee >= 18){
            this.age = agee;
            System.out.println("Employee added succesfully!");
        }
        else{
            throw new AgeMissMatchException("Age must be atleast 18");
        }
    }
}
