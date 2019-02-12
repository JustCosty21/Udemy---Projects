package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {
	
	public static void main(String[] args)
	{	
		//How many user we want to have
		System.out.println("How many students do you want to add: ") ;
		Scanner scann = new Scanner(System.in) ;
		
		//the number of students
		int noOfStudents = scann.nextInt() ;
		
		//create the array of Students
		Student[] students = new Student[noOfStudents] ;
		
		for(int index = 0 ; index < noOfStudents ; index ++)
		{
			//create the student
			students[index] = new Student() ;
			
			students[index].enroll() ;
			students[index].payTuitionBalance() ;
			System.out.println(students[index].showInfo()) ;
		}//for
	}
}
