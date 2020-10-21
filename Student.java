/*Programmer : Tinashe Dzauya
Reg #		  : BSC-04-16 */
 

import java.util.Scanner;

public class  Student{
	
	private  String name;
	private double[] grades;
	private int totalNumberOfStudents;
	
	Scanner inputFromUser = new Scanner(System.in);
	
	Student(){
	
	}
	
	public void setName(String name){
			this.name = name;
				}
				
		public String getName(){
					
	 		return this.name;
				}
		public void setGrades(double[] grades){
			this.grades = grades;
		
		}
		
		public double[] getGrades(){
			return this.grades;
		}
		
		
		public int getNumberOfStudents(int numberOfStudents){
			this.totalNumberOfStudents = numberOfStudents;
			return  numberOfStudents;
			
		}
		
		public double getAverageGrade(){
	          double sumOfGrades = 0;
                    for(int n = 1 ; n <= 3 ; n++){
                      System.out.println("What is your grade "+ n);
			grades = new double[3];
			grades[n-1] = inputFromUser.nextDouble();
			sumOfGrades += grades[n-1];
	              }
			return sumOfGrades / grades.length;
		}

		public void printStudentDetails(){
	
		System.out.println("Student name is "+this.name+" , average grade is "+ getAverageGrade() +
				" and the current number of students is "+this.totalNumberOfStudents);
		
		}

		
		
		
	

}