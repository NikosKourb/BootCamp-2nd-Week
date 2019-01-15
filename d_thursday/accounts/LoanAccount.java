package accounts;

public class LoanAccount extends Account {
	 
    private double installment;
    
    public LoanAccount() {}
    
    public LoanAccount(String owner, double balance, double interest, double inst) {
        super(owner, balance, interest);
        installment = inst;
    }
    
    public double getInstallment() {
        return installment;
    }
    
    public void setInstallment(double installment) {
        this.installment = installment;
    }
    
    public String toString() {
        return new String("Owner: " + getOwner() + " " + "\nBalance: " + getBalance() +
                "\nOverdraft: " + getInstallment() + "\nInterest: " + getInterest());
    }
    
}
