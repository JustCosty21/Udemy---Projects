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
	private String courses ;
	
	//balance
	private String balance ;
	
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
		
		System.out.println(firstName + " " + lastName + " " + yearOfStudy + " " + studentId) ;

		
	}//Student
	
	//generate a Student ID
	private void generateStudentId()
	{
		//after each student is created, their static id is increased
		id = id + 1 ;
		
		//create the student id
		studentId = this.yearOfStudy + "" + id ;
	
	}//generateStudentId
}
