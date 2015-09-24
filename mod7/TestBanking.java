package mod7;

/*
 * This class creates the program to test the banking classes.
 * It creates a new Customer and Account (with an initial balance),
 * and performs a series of transactions with the Account object.
 */
public class TestBanking {

  public static void main(String... args) {

    Account  account;

    Account savings = new Account(121,"John Doe");
    Account cheque = new Account(122,"John Perez");
    
    savings.credit(1000);
    System.out.println(savings);

    cheque.credit(500); 
    System.out.println(cheque);

    cheque.credit(1500); 
    System.out.println(cheque);

    cheque.debit(200); 
    System.out.println(cheque);
    
    
    Account myAccount;
    myAccount = cheque;

    System.out.println(myAccount);
  }
    
}
