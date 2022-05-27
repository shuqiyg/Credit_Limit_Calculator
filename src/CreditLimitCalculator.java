/********************************************** 
Workshop # 1
Course: JAC433
Last Name:Yang
First Name:Shuqi
ID:132162207
Section:NBB 
This assignment represents my own work in accordance with Seneca Academic Policy. 
Signature 
Date:2022-01-23
**********************************************/ 
import java.util.Scanner;

public class CreditLimitCalculator {	
	private int accountNum, initBal, curBal;
	private int totalCharge, monthlyCredit, creditLimit;
	
	public static void main(String[] args) {
		CreditLimitCalculator newCal = new CreditLimitCalculator();
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome To Credit Limit Calculator");
		boolean exit = false;
		int option;
		while(!exit) {
			System.out.println("1. Calculate Balance\n2. Display Details\n3. Exit");	
			option = input.nextInt();
			switch(option) {
			case 1:
				newCal.resetBalance();
				newCal.getAccountNumber();
				newCal.getInitialBal();
				newCal.getTotalCharge();
				newCal.getCredit();
				newCal.getCreditLimit();
				newCal.calBalance();
				System.out.println("\nYou can now choose option 2 to display your Balance Details\n");
				break;
			case 2:
				newCal.displayBal();
				break;
			case 3:
				System.out.println("Good Bye!");
				exit = true;
				break;
			default:
				System.out.println("Invalid Entry, Please try again....\n");
			}
		}	
		input.close();
	}
	
	private int calBalance() {
		curBal = (initBal + totalCharge - monthlyCredit);
		return curBal;
	}
	
	public void getAccountNumber() {
		Scanner input = new Scanner(System.in);
		System.out.print("Please Enter your Account Number: ");
		accountNum = input.nextInt();
	}
	public void getCreditLimit() {
		Scanner input = new Scanner(System.in);
		System.out.print("Please Enter your Credit Limit: ");
		creditLimit = input.nextInt();
	}
	
	public void getAccountNum() {
		Scanner input = new Scanner(System.in);
		System.out.println("Please Enter your Account Number: ");
		accountNum = input.nextInt();
	}
	public void getTotalCharge() {
		Scanner input = new Scanner(System.in);
		System.out.print("Please Enter Total Charges of this month: ");
		totalCharge = input.nextInt();

	}
	public void getInitialBal() {
		Scanner input = new Scanner(System.in);
		System.out.print("Please Enter the Balance: ");
		initBal = input.nextInt();
	}
	public void getCredit() {
		Scanner input = new Scanner(System.in);
		System.out.print("Please Enter the Credits: ");
		monthlyCredit = input.nextInt();
	}
	private void resetBalance() {
		curBal = 0;
	}
	public void displayBal() {
		System.out.println("Here's a Summary of your Account\n");
		System.out.println("Account Number: " + accountNum);
		System.out.println("Blance at the beginning of the month: " + initBal);
		System.out.println("Total of all items chared this month: " + totalCharge);
		System.out.println("Total credits applied this month: " + monthlyCredit);
		System.out.println("Current Balance: " + curBal);
		System.out.println("Credit Limit: " + creditLimit);
		if(curBal > creditLimit) {
			System.out.println("Credit limit exceeded!!!\n");
		}else {
			System.out.println("You are in good shape.\n");
		}
	}
}
