package accounts;

public class StudentAccount extends Account {
    
    private double overdraft;
    
    public StudentAccount() {}
    
    public StudentAccount(String a, double b, double i, double od) {
        super(a,b,i);
        overdraft = od;
    }
    
    public double getOverdraft() {
        return overdraft;
    }
    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }
    
    public String toString() {
        return new String("Owner: " + getOwner() + " " + "\nBalance: " + getBalance() +
                "\nOverdraft: " + getOverdraft() + "\nInterest: " + getInterest());
    }
}