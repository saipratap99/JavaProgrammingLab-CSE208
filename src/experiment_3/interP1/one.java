/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package experiment_3.interP1;

/**
 *
 * @author DELL
 */
public class one {
    public int sum(int a[]){
        int sum = 0;
        for(int i=0;i<a.length;i++){
            if(a[i]%2 == 0)
                sum += a[i];
        }
        return sum;
    }
}
