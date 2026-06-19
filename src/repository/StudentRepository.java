package repository;

import entity.Student;

public class StudentRepository {

	public static Student[] getAllStudent() {
		
		Student s = new Student();
		s.id = 101;
		s.firstName = "Ram";
		s.lastName = "Patil";
		s.englishObtained = 78;
		s.mathsObtained = 98;
		s.scienceObtained = 75;
		
		Student s1 = new Student();
		s1.id = 102;
		s1.firstName = "Sham";
		s1.lastName = "Patil";
		s1.englishObtained = 98;
		s1.mathsObtained = 77;
		s1.scienceObtained = 67;
		
		Student s2 = new Student();
		s2.id = 103;
		s2.firstName = "Riya";
		s2.lastName = "Raje";
		s2.englishObtained = 92;
		s2.mathsObtained = 72;
		s2.scienceObtained = 62;
		
		Student s3 = new Student();
		s3.id = 104;
		s3.firstName = "Jiya";
		s3.lastName = "Deshmukh";
		s3.englishObtained = 93;
		s3.mathsObtained = 73;
		s3.scienceObtained = 63;
		
		Student s4 = new Student();
		s4.id = 105;
		s4.firstName = "Sita";
		s4.lastName = "Kota";
		s4.englishObtained = 94;
		s4.mathsObtained = 74;
		s4.scienceObtained = 64;
	
		Student s5 = new Student();
		s5.id = 106;
		s5.firstName = "Gita";
		s5.lastName = "Chaudhari";
		s5.englishObtained = 95;
		s5.mathsObtained = 75;
		s5.scienceObtained = 65;
	
		Student s6 = new Student();
		s6.id = 107;
		s6.firstName = "Sonu";
		s6.lastName = "Rai";
		s6.englishObtained = 96;
		s6.mathsObtained = 76;
		s6.scienceObtained = 66;

		Student s7 = new Student();
		s7.id = 108;
		s7.firstName = "Monu";
		s7.lastName = "Jivane";
		s7.englishObtained = 97;
		s7.mathsObtained = 77;
		s7.scienceObtained = 67;

		Student s8 = new Student();
		s8.id = 109;
		s8.firstName = "Titu";
		s8.lastName = "Awad";
		s8.englishObtained = 98;
		s8.mathsObtained = 78;
		s8.scienceObtained = 68;

		Student s9 = new Student();
		s9.id = 110;
		s9.firstName = "Ritu";
		s9.lastName = "Meshram";
		s9.englishObtained = 99;
		s9.mathsObtained = 79;
		s9.scienceObtained = 69;
		
		Student[] studentArray = {s, s1, s2, s3, s4, s5, s6, s7, s8, s9};
		return studentArray;
	}
	
}
