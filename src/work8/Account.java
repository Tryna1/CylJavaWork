package work8;

//11.8
import java.util.Date;
import java.util.ArrayList;

public class Account {
	private String name;
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated;
	
	public Account(int id, double balance, double annualInterestRate) {
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
	}
	public Account(String name, int id, double balance) {
		this.name = name;
		this.id = id;
		this.balance = balance;
	}
	public void set_Id_Balance(int id, double balance) {
		this.id = id;
		this.balance = balance;
	}
	public int getId() {
		return id;
	}
	public double getBalance() {
		return balance;
	}
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	public double getMonthInterestRate() {
		return annualInterestRate;
	}
	public double withDraw() {
		return balance + balance * annualInterestRate;
	}
	public void deposit(double more_balance) {
		balance += more_balance;
	}
	
}