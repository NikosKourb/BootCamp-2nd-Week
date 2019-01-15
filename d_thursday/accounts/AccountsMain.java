package accounts;

public class AccountsMain {
	 
    public static void main(String[] args) {
        StudentAccount sa = new StudentAccount("Bill", 20.0 , 0.02, 1000.0);
        LoanAccount la = new LoanAccount();
        la.setBalance(30000);
        la.setInstallment(200.0);
        la.setOwner("George");
        la.setInterest(12.5);
        
        System.out.println(sa);
        System.out.println();
        System.out.println(la);
    }
 
}