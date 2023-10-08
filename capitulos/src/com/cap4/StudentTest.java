package com.cap4;

public class StudentTest {

	public static void main(String[] args) {
		
		Student account1 = new Student("André", 100);
		Student account2 = new Student("Joao", 70);
		
		System.out.println("Aluno: "+ account1.getName() + " - " + "Nota: " + account1.getLetterGrade());
		
		System.out.println(account2.getName() + " " + account2.getLetterGrade());

	}

}
