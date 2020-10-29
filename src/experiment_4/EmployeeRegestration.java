/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package experiment_4;
import experiment_4.employee.*;
/**
 *
 * @author DELL
 */
public class EmployeeRegestration {
    public static void main(String[] args){
        Employee emp = new Employee();
        try{
            emp.addEmployee();
        }catch(Exception e){
            System.out.println("Problem occured while adding employee :(");
            System.out.println(e);
        }
    }
}
