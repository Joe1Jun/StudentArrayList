

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
	
	private int age ;
	private String name;
	private int rollNumber;
	
	
 	public Student() {
 		
 		
 	}
	
	
	public Student(int age, String name, int rollNumber) {
		
		this.age = age;
		this.name = name;
		this.rollNumber = rollNumber;
		
		
	}
	
	
	
	public void findStudent(String student) {
		
		
		
		
		
	}
	
	public void printAllStudents(ArrayList<Student> students) {
		
		//the is a for each loop it will print each instance of student objects within the 
		//arraylist students;
		
		for ( Student  student : students) {
			
			
			System.out.println("Name :" + student.getName());
			System.out.println("Age: " + student.getAge());
			System.out.println("RollNumber: " + student.getRollNumber());
			
			
			
		}
	}
	
	


	public void setAge(int age) {
		this.age = age;
	}



	public void setName(String name) {
		this.name = name;
	}



	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}



	public int getAge() {
		return age;
	}


	public String getName() {
		return name;
	}


	public int getRollNumber() {
		return rollNumber;
	}
	
	
	// Method to search for a student by name
	public static void searchStudentByNameAndPrintDetails(ArrayList<Student> students, Scanner input) {
        System.out.println("Enter the name of the student you want to search for:");
        String searchName = input.nextLine();
        boolean found = false;
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(searchName)) {
                System.out.println("Student found:");
                System.out.println("Name: " + student.getName());
                System.out.println("Age: " + student.getAge());
                System.out.println("RollNumber: " + student.getRollNumber());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student with name " + searchName + " not found.");
        }
    }
	
	

}
