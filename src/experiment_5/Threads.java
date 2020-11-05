/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package experiment_5;

import java.util.*;

/**
 *
 * @author DELL
 */

// factorial thread implements runnable
class Factorial implements Runnable {

    protected int fact;
    protected int n;
    
    // overrides the rin method
    @Override
    public void run() {
        n = Threads.getInput("Enter number to calculate its factorial: ");
        fact = 1;
        for (int i = 1; i <= n; i++) {
            this.fact *= i;
        }

        System.out.println(n + "! is: " + getFact());
    }

    public int getFact() {
        return fact;
    }

    public void setN(int n) {
        this.n = n;
    }

}

// Sum of natural numbers thread implements runnable
class SumofNumbers implements Runnable {

    protected int n;
    protected int sum;

    // overrides the rin method
    @Override
    public void run() {
        n = Threads.getInput("Enter number to sum of N natural numbers: ");
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("The sumof numbers upto " + n + " is: " + getSum());
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getSum() {
        return sum;
    }

}

// Multiplication table thread implements runnable
class MutliplicationTable implements Runnable {

    protected int a;

    // overrides the rin method
    @Override
    public void run() {
        try {
            Thread.sleep(100);
        } catch (Exception e) {
        }
        a = Threads.getInput("Enter number to print table: ");
        for (int i = 1; i <= 10; i++) {
            System.out.println(a + "x" + i + " = " + (a * i));
        }
    }
}

public class Threads {

    public static void main(String[] args) throws Exception {
        Factorial fact = new Factorial();
        Thread t1 = new Thread(fact);

        SumofNumbers sum = new SumofNumbers();
        Thread t2 = new Thread(sum);

        MutliplicationTable table = new MutliplicationTable();
        Thread t3 = new Thread(table);
        // getting priorities
        System.out.println("*************Before setting priorities*******");

        System.out.println("Thread fact priority: " + t1.getPriority());
        System.out.println("Thread sum priority: " + t2.getPriority());
        System.out.println("Thread table priority: " + t3.getPriority());

        //setting priority
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY - 1);
        t3.setPriority(Thread.MIN_PRIORITY);

        System.out.println("*************After setting priorities*******");

        System.out.println("Thread fact priority: " + t1.getPriority());
        System.out.println("Thread sum priority: " + t2.getPriority());
        System.out.println("Thread table priority: " + t3.getPriority());

        // start first 2 threads
        t1.start();
        t2.start();

        // main Thread will wait till threads t1 and t2 complete the job 
        t1.join();
        t2.join();
        
        System.out.println("Thread fact is Alive: " + t1.isAlive());
        System.out.println("Thread sum is Alive: " + t2.isAlive());
        System.out.println("Thread table is Alive: " + t3.isAlive());

        // after completing job main Thread start executing 
        // new thread starts
        t3.start();
    }
    // synchronized method for getting input
    // one thread can access at a time
    public static synchronized int getInput(String s) {
        Scanner sc = new Scanner(System.in);
        System.out.print(s);
        return Integer.parseInt(sc.nextLine());
    }
}
