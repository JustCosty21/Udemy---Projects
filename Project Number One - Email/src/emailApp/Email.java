package emailApp;

import java.util.Scanner; 

public class Email {
	
	//first Name
	private String firstName ;
	
	//second Name
	private String lastName ;
	
	//departament
	private String departament;
	
	//password
	private String password ;
	
	//the mail box capacity
	private int mailBoxCapacity = 500 ;
	
	//default password length
	private int defaultPasswordLength = 10 ;
	
	//the email
	private String email ;
	
	//alternate email
	private String alternateEmail ;
	
	//the sufix of the company
	private String companySuffix = "aeycompany.com" ;
	
	//constructor which gets the first and last name
	public Email(String firstName, String lastName)
	{
		this.firstName = firstName ;
		this.lastName = lastName ;
		System.out.println("EMAIL WAS CREATED: " + this.firstName + " " + this.lastName) ;
		
		//Method to get the department and return it
		this.departament = setDepartament() ;
		
		//print what departament is
		System.out.println("Departament is: " + this.departament) ;
		
		//method to return a random password
		this.password = randomPassword(defaultPasswordLength) ;
		
		//print the password
		System.out.println("The password is: " + this.password) ;
		
		//Combine elements to get emails
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + departament + "." + companySuffix ;
		
		//Print the email
		System.out.println("Email was created: " + email) ;
	}//Email
	
	//Ask for the department
	private String setDepartament()
	{
		//make a choose
		System.out.println("Enter the department\n1 for Sales\n2 for Development\n3 for accounting\n0 for none") ;
		
		//the scanner
		Scanner scan = new Scanner(System.in) ;
		
		//getting the department number
		int departamentChoice = scan.nextInt() ;
		
		//return departament
		if(departamentChoice == 1)
			return "sales" ;
		else if(departamentChoice == 2)
			return "development" ;
		else if(departamentChoice == 3)
			return "accounting" ;
		else return "" ;
	}//setDepartament
	
	private String randomPassword(int length)
	{
		//the set of password
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUWXYZ0123456789!@$%" ;
		
		//the actual password
		char[] thePassword = new char[length] ;
		
		for(int i = 0 ; i < length ; i ++)
		{
			//get the random Number
			int randomNumber = (int)(Math.random() * passwordSet.length()) ;
			
			//set the character of the password
			thePassword[i] = passwordSet.charAt(randomNumber) ;
 		}//for
		
		//return the password as a string
		return new String(thePassword) ;
	}//randomPassword
	
	//Set the mailbox capacity
	public void setMailboxCapacity(int capacity)
	{
		this.mailBoxCapacity = capacity ;
	}//setMailboxCapacity
	
	//set an alternate email
	public void setAlternateEmail(String altEmail)
	{
		this.alternateEmail = altEmail ;
	}//setAlternateEmail
	
	//change the password
	public void changePassword(String password)
	{
		this.password = password ;
	}//changePassword
	
	//get the mailbox capacity
	public int getMailboxCapacity()
	{
		return mailBoxCapacity ;
	}//getMailboxCapacity
	
	//get the alternate email
	public String getAltEmail()
	{
		return alternateEmail ;
	}//getAltEmail
	
	//get the password
	public String getPass()
	{
		return password ;
	}//getPass
	
	public String showInfo()
	{
		return "DISPLAY NAME IS: " + firstName + " " + lastName +
				"\nCOMPANY EMAIL: " + email + 
				"\nMAILBOX CAPACITY: " + mailBoxCapacity + "mb" ;
		
	}
	
}
