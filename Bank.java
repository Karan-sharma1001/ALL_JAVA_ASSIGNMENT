package practice;

import java.util.ArrayList;

public class Bank
{

	private ArrayList<Account>acclist=new ArrayList<Account>();
	
	
	
	public void openAccount(Account a)
	{
		acclist.add(a);
	}


	public ArrayList<Account> getAcclist() 
	{
		return acclist;
	}


	

	
	
	
}
