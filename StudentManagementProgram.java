/* Programmer : Tinashe Dzauya
   Reg #	  : BSC-04-16 */

/** 
	The program gets name of a student and his or her three grades then use the grades to compute average grade
	which is returned to a printing method

**/

import java.util.Scanner;

public class StudentManagementProgram{
	
	public static void main(String[] args){
		
	   // the statement creates a scanner object "inputFromUser"
		Scanner inputFromUser = new Scanner(System.in);
		
          //creating an obect of the "Student" class
		Student student = new Student();

	
	// getting  the user's name
		System.out.println(" Enter your name : ");
		String name = inputFromUser.nextLine();
	
	// an array to store 3 grades entered by the user
		double[] grade = new double[3];
    
       
         //setting grades in the "Student" class' "setGrades" method as entered by user
		student.setGrades(grade);

        //getting grades entered by user using "getGrades" method in "Student" class
                student.getGrades();
		student.setName(name);


	//getting  the total number of students from the user	
 		System.out.println(" Enter  total number of students :");
		int numberOfStudents = inputFromUser.nextInt();
	

	//taking total number of students to the "Student" class' "getNumberOfStudents" method
		student.getNumberOfStudents(numberOfStudents);

          // invoking the "Student" class' "printStudentDetails" method to print student details
		student.printStudentDetails();
		
		
		
		
	}
	
	
	
}