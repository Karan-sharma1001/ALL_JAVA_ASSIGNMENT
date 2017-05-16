package practice;

import java.io.Serializable;

public class Customer implements Serializable
{

	private String cName;
	private String contact;
	private String email;
	private String Pan;
	
	
	
	public Customer()
	{
		super();
	}

	
	

	public String getContact() {
		return contact;
	}




	public void setContact(String contact) {
		this.contact = contact;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public Customer(String cName, String pan) throws InvalidPanException
	{
		super();
		if(pan.length()==10)
		{
		this.cName = cName;
		this.Pan = pan;
	    }
		
		else throw new InvalidPanException("Pan number is invalid");
	}




	@Override
	public String toString() {
		return ", cName=" + cName + ", contact=" + contact + ", email="
				+ email + ", Pan=" + Pan;
	}
	
	
}
