package studentdatabaseapp;

import java.util.Scanner;

public class Student {
	
	//first Name
	private String firstName ;
	
	//last Name
	private String lastName ;
	
	//the year of the student 
	private int yearOfStudy ;
	
	//the id
	private String studentId ;
	
	//courses
	private String courses = "" ;
	
	//balance
	private int balance ;
	
	//cost of course
	private static int costOfCourse = 600 ;
	
	//default 4 digit id
	private static int id = 1000 ;
	
	//constructor - uses name and year of study
	public Student()
	{
		//create the scanner
		Scanner scan = new Scanner(System.in) ;
		
		//get the first name
		System.out.println("Please enter first name of the student: ") ;
		this.firstName = scan.nextLine() ;
		
		
		//get the last name
		System.out.println("Please enter last name of the student: ") ;
		this.lastName = scan.nextLine() ;
		
		//get the first name
		System.out.println("1 - Freshman\n2 - Sophmore\n3 - Junior\n4 - Senior\n Please enter the graduation year of the student: ") ;
		this.yearOfStudy = scan.nextInt() ;
				
		generateStudentId() ;
	}//Student
	
	//generate a Student ID
	private void generateStudentId()
	{
		//after each student is created, their static id is increased
		id = id + 1 ;
		
		//create the student id
		studentId = this.yearOfStudy + "" + id ;
	
	}//generateStudentId
	
	//method to make the student enroll to a course
	public void enroll()
	{
		do {
			
			System.out.print("Choose course to enrool or press Q to quit: ") ;
			
			//create the scanner
			Scanner scan = new Scanner(System.in) ;
			
			//give the chosen value to a variable
			String course = scan.nextLine() ;
			
			//check if course if different from Q - if so, add it to the list of courses
			if(!course.equals("Q"))
			{
				//add the course to the list of courses
				courses = courses + "\n" + course ;
				
				//modify the student's balance
				balance += costOfCourse ;
			}//if
			else
				break ;
		}while(true) ;		
		
	}//enroll
	
	//method to view the balance
	public void viewBalance()
	{
		System.out.println("Your balance is: £" + balance) ;
	}//viewBalance
	
	//method to pay the tuition balance
	public void payTuitionBalance()
	{
		//create the scanner
		Scanner scan = new Scanner(System.in) ;
		
		System.out.print("How much would you like to pay? £") ;
		
		//get the payment
		int payment = scan.nextInt() ;
		
		//reduce from balance the payment
		balance -= payment ;
		
		System.out.println("Thank you! You paid: £" + payment) ;
		viewBalance() ;
	}//payTuitionBalance
	
	//show the info
	public String showInfo()
	{
		return "Name: " + firstName + " " + lastName +
				"\nYear of Study: " + yearOfStudy +
				"\nStudent Id: " + id +
				"\nCourses Enrolled:" + courses +
				"\nBalance is: £" + balance ;
	}
}
