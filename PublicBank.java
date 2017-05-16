package practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class PublicBank {

	public static void main(String[] args) throws FileNotFoundException
   {
		// TODO Auto-generated method stub
		
		Bank b=new Bank();
		Scanner sc=new Scanner(System.in);
		Customer []c=new Customer[5];
		Account a1=new Account();
		Account[]acc=new Account[5];
		
		File f=new File("accountdetails.txt1");
		FileInputStream fis;
		FileOutputStream fos;
		ObjectOutputStream oos;
		
		
		for (int i = 0; i < 5; i++)
		{
			
			try {
				
				System.out.println("enter " +(i+1) +" customer name");
				String a=sc.next();
				System.out.println("enter "+(i+1) +"customer pan detail");
				String s=sc.next();
				c[i] = new Customer(a,s);
				System.out.println("enter " +(i+1) +" customer contact number");
				c[i].setContact(sc.next());
				System.out.println("enter "+(i+1) +" customer email");
				c[i].setEmail(sc.next());
				
				System.out.println("enter "+(i+1) +" account number");
				int d=sc.nextInt();
				acc[i]=new Account();
				acc[i]=new Account(d,c[i]);
				
				acc[i].setBalance(10000.00);
				
				b.openAccount(acc[i]);
				
				fos=new FileOutputStream(f);
				oos=new ObjectOutputStream(fos);
				oos.writeObject(acc[i]);
				oos.close();
				fos.close();
				
				
			} catch (InvalidPanException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		a1.accountSummary(b);
	}

}
