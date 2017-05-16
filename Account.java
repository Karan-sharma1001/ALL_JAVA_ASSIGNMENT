package practice;

import java.io.Serializable;

public class Account implements Serializable
{

	private int accNo;
	private double balance;
	
	private Customer c;
	private Bank bank;
	

	public Account() {
		super();
	}

	public int getAccNo() {
		return accNo;
	}

	public double getBalance() {
		return balance;
	}

	public Customer getC() {
		return c;
	}

	public Account(int accNo, Customer c)
	{
		super();
		this.accNo = accNo;
		this.c = c;
	}

	public void setBalance(double balance) 
	{
		this.balance = balance;
	}
	
	public void deposit(double amt)
	{
		this.balance=amt;
	}
	
	public void accountSummary(Bank b)
	{
		this.bank=b;
		for (int i = 0; i < this.bank.getAcclist().size(); i++)
		{
			
		
		System.out.println(this.bank.getAcclist().get(i));}
		
	}
	public void withdrawal(double amt) throws LowBalanceException 
	{
		if(this.balance>1000)
		{ 
			this.balance=this.balance-amt;
			System.out.println("transaction successful");
			System.out.println("your available balance is " +this.balance);
		}
		
		else
		throw new LowBalanceException("your don't have sufficient amount in your account");
		
		
		
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", balance=" + balance ; 
					}
	
	
}
