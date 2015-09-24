package mod7;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Deivid
 */
public class Account {
    
    private double balance;
    private int accountNumber;
    private String accountName;

// this is the constructor

    public Account(int accountNumber, String accountName) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        balance = 0;
    }

      
    public double getBalance (){
        return balance;
    }
    
    public void credit (double amount){
        balance = balance + amount;
    }
    
    public void debit (double amount){
        
            balance = balance - amount; 
    }
    
    public String toString() {

        return ("#######################\n" + "Account number: "+ accountNumber +
                "\nAccount name: " + accountName
                + "\nBalance: $" + balance 
                + "\n#######################");

    }
}
