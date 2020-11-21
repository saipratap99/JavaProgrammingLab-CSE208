/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package experiment_6;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class WritingNonPrimitiveData {

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        FileWriter f = new FileWriter("employee.txt");
        System.out.println("***********************************");
        System.out.printf("%-5s%s%5s%n%n", "***", "Employee Record Management System", "***");
        // loop continues till opyion entered is 0
        int option = 1;
        while (option != 0) {
            System.out.println("***********************************");
            System.out.printf("%-5s%-20s%5s%n%n", "***", "0.Exit", "***");
            System.out.printf("%-5s%-15s%5s%n%n", "***", "1.Add Employee", "***");
            System.out.printf("%-5s%-13s%5s%n%n", "***", "2.Seacrch Employee", "***");
            System.out.println("***********************************");
            // prompts and get the option
            System.out.print("\n\nChoose option:");
            option = Integer.parseInt(sc.nextLine());

            // depending on the option 
            // certain tasks will be performed
            switch (option) {
                case 1:
                    Employee e = Employee.AddEmployee();
                    f.write(e.getEmpId() + "\n");
                    f.write(e.getEmpName() + "\n");
                    f.write(e.getEmpDOB() + "\n");
                    f.write(e.getEmpSalary() + "\n");
                    f.write("**********************************\n");
                    f.flush();
                    break;
                case 2:
                    FileReader fin = new FileReader("employee.txt");
                    boolean found = false;
                    System.out.println("Search Employee:");
                    int id = Integer.parseInt(sc.nextLine());
                    int i;
                    while ((i = fin.read()) != -1) {
                        String s = "";
                        s = s + (char) i;
                        while ((i = fin.read()) != 10) {
                            s = s + String.valueOf((char) i);
                        }
                        int num = Integer.parseInt(s);
                        if (num == id) {
                            found = true;
                            break;
                        }else{
                            for(int j=0;j<4;j++)
                                while(fin.read()!=10);
                        }
                    }
                    if(found){
                        for(int j=0;j<4;j++){
                                while((i=fin.read())!=10){
                                    System.out.print((char)i);
                                }
                                System.out.println();
                        }

                    }else{
                        System.out.println("ID not found");
                    }
                    break;
                case 0:
                    System.out.println("*** Thank You! ***");
                    break;
                default:
                    System.out.println("!!! Please choose from available options !!!");
            }
        }
        f.close();

    }
}
