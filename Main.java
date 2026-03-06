import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ATM atm=new ATM();
		while(true) {
			System.out.println("\n==== ATM MENU====");
			System.out.println("1.Create Account");
			System.out.println("2.Check Balance");
			System.out.println("3.Deposit Money");
			System.out.println("4.Withdraw Money");
			System.out.println("5.Exit");
			System.out.print("Enter your choice: ");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.print("Enter Account Number: ");
				int accNo=sc.nextInt();
				sc.nextLine();
				System.out.print("Enter Name:");
				String name=sc.nextLine();
				System.out.print("Enter Initial Balance:");
				double balance=sc.nextDouble();
				atm.createAccount(accNo, name, balance);
				break;
				
			case 2:
				System.out.print("Enter Account Number:");
				accNo=sc.nextInt();
				atm.checkBalance(accNo);
				break;
				
			case 3:
				System.out.print("Enter Account Number:");
				accNo=sc.nextInt();
				System.out.print("Enter Amount:");
				double deposite=sc.nextDouble();
				atm.deposit(accNo, deposite);
				break;
				
			case 4:
				System.out.print("Enter Account Number:");
				accNo=sc.nextInt();
				System.out.print("Enter Amount:");
				double withdraw=sc.nextDouble();
				atm.withdraw(accNo, withdraw);
				break;
				
			case 5:
				System.out.println("Thank you for using ATM...");
				return;
				
			default:
				System.out.println("Invalid choice");
				
			}
		}
	}
}
