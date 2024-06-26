

import java.util.*;

public class Runner {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<Student>();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Would you like to enter a student or search for one? Enter 'enter' or 'search':");
            String response1 = input.nextLine();

            if (response1.equals("enter")) {
                Student student = new Student();

                System.out.println("Name:");
                String name = input.nextLine();
                student.setName(name);

                System.out.println("Age:");
                int age = input.nextInt();
                student.setAge(age);

                System.out.println("RollNumber:");
                int rollNumber = input.nextInt();
                student.setRollNumber(rollNumber);

                students.add(student);
                
                input.nextLine(); // Consume newline character after nextInt()
            } else if (response1.equals("search")) {
                Student.searchStudentByNameAndPrintDetails(students, input);
            } else {
                System.out.println("Invalid option. Please enter 'enter' or 'search'.");
            }

            System.out.println("Do you want to enter another student? (yes/no)");
            String response = input.nextLine();

            if (!response.equalsIgnoreCase("yes")) {
                break;
            }
        }
    }
}

	
	


