import java.util.ArrayList;

public class ATM {
	private ArrayList<Account>accounts=new ArrayList<>();
	public void createAccount(int accNo,String name,double balance) {
		accounts.add(new Account(accNo,name,balance));
		System.out.println("Account created Successfully.");
	}
	public void checkBalance(int accNo) {
		for(Account acc:accounts) {
			if(acc.getAccountNumber()==accNo) {
				System.out.println("Balance:"+acc.getBalance());
				return;
			}
		}
		System.out.println("Account Not Found.");
	}
	public void deposit(int accNo,double amount) {
		for(Account acc:accounts) {
			if(acc.getAccountNumber()==accNo) {
				acc.deposit(amount);
				return;
			}
		}
		System.out.println("Account not found.");
	}
	public void withdraw(int accNo,double amount) {
		for(Account acc:accounts) {
			if(acc.getAccountNumber()==accNo) {
				acc.withdraw(amount);
				return;
			}
		}
		System.out.println("Account nt found.");
	}
}
