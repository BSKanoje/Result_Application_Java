package main;

import java.util.Scanner;
import helper.OutputHelper;
import entity.Student;
import repository.StudentRepository;
import service.StudentService;

public class Test {

	public static void main(String[] args) {

		while (true) {
			Scanner sc = new Scanner(System.in);
			StudentService service = new StudentService();

			System.err.println("!!! Welcome to Result application !!!");
			System.out.println("Please select option of your choice...");
			System.out.println("1. Get student details by name");
			System.out.println("2. Get all student details");
			System.out.println("3. Get student details by id");

			
			System.out.println();
			System.out.print("Please enter your option number only:");
			int choice = sc.nextInt();
			System.out.println();

			switch (choice) {
				case 1:
					System.out.print("Enter name of Student: ");
					String name = sc.next();
		
					// 1. get student details by name
					service.getStudentDetailsByName(name);
					break;
				case 2:
					// 2. get all student details
					service.getAllStudentDetails();
					break;
				case 3:
					System.out.print("Enter id of Student: ");
					int id = sc.nextInt();
					
					// 2. get student details by id
					service.getStudentDetailsById(id);
					break;
				default:
					System.out.println("Invalid option selected!!!!!!!!!");
			}

		}
		
	}

}
