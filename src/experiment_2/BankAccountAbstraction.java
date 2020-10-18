/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package experiment_2;

import java.util.*;

/**
 *
 * @author DELL
 */
abstract class Account {

    int accountId, custId;

    abstract double deposit(int a, int b);

    abstract double withdraw(int a, int b);
}

class Savings extends Account {

    private double bal;

    Savings(int accountId, int custId, double bal) {
        this.accountId = accountId;
        this.custId = custId;
        this.bal = bal;
    }

    @Override
    double deposit(int accId, int amount) {
        if (accountId == accId) {
            bal += amount;
        } else {
            return -1;
        }
        return bal;
    }

    @Override
    double withdraw(int accId, int amount) {
        if (accountId == accId) {
            if (bal >= amount) {
                bal -= amount;
            } else {
                return 0;
            }
        } else {
            return -1;
        }
        return bal;
    }
}

public class BankAccountAbstraction {

    public static void main(String args[]) {
        Savings s[] = new Savings[5];
        s[0] = new Savings(122005067, 5067, 4520.25);
        s[1] = new Savings(122005167, 5167, 2440.00);
        s[2] = new Savings(122005267, 5267, 140.25);
        s[3] = new Savings(122005367, 5367, 520.8);
        s[4] = new Savings(122005467, 5467, 45.2);
        Scanner sc = new Scanner(System.in);
        int opt;
        System.out.println("Enter 1.Deposit 2.Withdraw: ");
        opt = sc.nextInt();
        System.out.println("Enter accountId; ");
        int acc = sc.nextInt();
        System.out.println("Enter amount: ");
        int amount = sc.nextInt();

        switch (opt) {
            case 1:
                for (int i = 0; i < 5; i++) {
                    double bal = s[i].deposit(acc, amount);
                    if (bal == -1) {
                        if(i == 4)
                        System.out.println("Account Not found : (");
                    }
                    else{
                        System.out.println("Bal is " + bal + " rs.");
                        break;
                    }
                }
                break;
            case 2:
                for (int i = 0; i < 5; i++) {
                    double bal = s[i].withdraw(acc, amount);
                    if (bal == -1) {
                        if(i == 4)
                        System.out.println("Account Not found : (");
                    }
                    else if( bal == 0){
                        System.out.println("Insufficient funds!");
                        break;
                    }
                    else{
                        System.out.println("Bal is " + bal + " rs.");
                        break;
                    }
                }


                break;
            default:

        }

    }
}
