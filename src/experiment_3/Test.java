/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package experiment_3;
import experiment_3.pkg.*;
/**
 *
 * @author DELL
 */
public class Test implements Inter1,Inter2 {
    @Override
    public void max(int a[]){
        int max = a[0];
       int min = a[0];
       int len = a.length;
       for(int i=0;i<len;i++){
           if(a[i] < min )
               min = a[i];
           if(a[i]> max)
               max = a[i];
       }
       System.out.println("Min: " + min);
       System.out.println("Max: " + max);
    }
}
