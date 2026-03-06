
public class Account {
	private int accountNumber;
	private String name;
	private double balance;
	
	public Account(int accountNumber,String name,double balance) {
		this.accountNumber=accountNumber;
		this.name=name;
		this.balance=balance;
		
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void deposit(double amount) {
		balance+=amount;
		System.out.println("Deposit successful.New balance:"+balance);
	}
	public void withdraw(double amount) {
		if(amount<=balance) {
			balance-=amount;
			System.out.println("Withdrawal Successful. Remaining balance: "+balance);
		}else {
			System.out.println("Insufficient balance.");
		}
	}
	public void display() {
		System.out.println("Account number: "+accountNumber+",Name:"+name+",Balance:"+balance);
	}
}
