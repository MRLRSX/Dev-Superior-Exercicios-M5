package ExercicioTres;

import java.util.Locale;
import java.util.Scanner;

import ExercicioTres.entities.Student;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entradaDados = new Scanner(System.in);
		Student student = new Student();

		System.out.println("SISTEMA DE NOTAS ");

		System.out.println("INFORME O NOME ");
		student.name = entradaDados.nextLine();
		System.out.println("NOTA 1 ");
		student.grade1 = entradaDados.nextDouble();
		System.out.println("NOTA 2");
		student.grade2 = entradaDados.nextDouble();
		System.out.println("NOTA 3");
		student.grade3 = entradaDados.nextDouble();

		System.out.printf("FINAL GRADE: %.2f%n", student.finalGrade());
		if (student.finalGrade() < 60.0) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", student.missingPoints());
		} else {
			System.out.println("PASS");
		}
		entradaDados.close();

	}
}
