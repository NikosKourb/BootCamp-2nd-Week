package accounts;

public class Account {
	 
    private String owner;
    private double balance;
    private double interest;
    
    public Account() {}
    
    public Account(String owner, double balance, double interest) {
        this.owner = owner;
        this.balance = balance;
        this.interest = interest;
    }
    
    public String getOwner() {
        return owner;
    }
 
    public void setOwner(String owner) {
        this.owner = owner;
    }
 
    public double getBalance() {
        return balance;
    }
 
    public void setBalance(double balance) {
        this.balance = balance;
    }
 
    public double getInterest() {
        return interest;
    }
 
    public void setInterest(double interest) {
        this.interest = interest;
    }
 
}