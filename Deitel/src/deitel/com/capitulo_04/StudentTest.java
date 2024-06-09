package capitulo_04;

public class StudentTest {

	public static void main(String[] args) {
		
		Student account1 = new Student("joao", 75.5);
		Student account2 = new Student("Joaquim", 90);
		
		System.out.printf("%s tirou a nota: %s%n", account1.getName(), account1.getLetterGrade());
		System.out.printf("%s tirou a nota: %s%n", account2.getName(), account2.getLetterGrade());

	}

}
