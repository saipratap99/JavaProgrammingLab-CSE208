/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package experiment_4;

import experiment_4.student.*;

/**
 *
 * @author DELL
 */
public class StudentExaminationTable {

    public static void main(String[] args) {
        StudentsMarksModel s[] = new StudentsMarksModel[5];
        int i;
        for (i = 0; i < 2; i++) {
            s[i] = new StudentsMarksModel();
            try {
                s[i].getMarksData();
            } catch (Exception e) {
                System.out.println(e);
                break;
            }
        }
        if (i == 2) {
            for (i = 0; i < 2; i++) {
                System.out.println("**************");
                s[i].calPercentage();
            }
        }
        else{
            System.out.println("Exception ocuured!");
        }
    }
}
