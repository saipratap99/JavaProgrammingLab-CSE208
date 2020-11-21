/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package experiment_6;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Employee {
    protected int empId;
    protected String empName;
    protected int empDOB;
    protected float empSalary;

    public Employee(int empId, String empName, int empDOB, float empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empDOB = empDOB;
        this.empSalary = empSalary;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpDOB() {
        return empDOB;
    }

    public void setEmpDOB(int empDOB) {
        this.empDOB = empDOB;
    }

    public float getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(float empSalary) {
        this.empSalary = empSalary;
    }
    
    public static Employee AddEmployee(){
        int id,dob;
        String name;
        float salary;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee id: ");
        id = Integer.parseInt(sc.nextLine());
        System.out.print("employee name: ");
        name = sc.nextLine();
        System.out.print("employee dob: ");
        dob = Integer.parseInt(sc.nextLine());
        System.out.print("employee salary: ");
        salary = Float.parseFloat(sc.nextLine());
        return new Employee(id,name,dob,salary);
    }

    @Override
    public String toString() {
        return "Employee{" + "empId=" + empId + ", empName=" + empName + ", empDOB=" + empDOB + ", empSalary=" + empSalary + '}';
    }
    
}
