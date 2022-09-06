package ExercicioUm;

import java.util.Locale;
import java.util.Scanner;

import ExercicioUm.entities.Rectangle;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entradaDados = new Scanner(System.in);
		Rectangle rect = new Rectangle();

		System.out.println("SISTEMA DE CALCULAR AREA DE UM RECTANGLE ");

		System.out.println("Enter rectangle width and height:");
		rect.width = entradaDados.nextDouble();
		rect.height = entradaDados.nextDouble();

		System.out.printf("AREA = %.2f%n", rect.area());
		System.out.printf("PERIMETER = %.2f%n", rect.perimeter());
		System.out.printf("DIAGONAL = %.2f%n", rect.diagonal());

		entradaDados.close();
	}
}
