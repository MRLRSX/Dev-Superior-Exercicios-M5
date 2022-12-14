package ExercicioCinco;

import java.util.Locale;
import java.util.Scanner;

import ExercicioCinco.entities.Calculator;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entradaDados = new Scanner(System.in);

		System.out.println("SISTEMA DE CALCULO DE CIRCUNFERENCIA ");
		System.out.print("Enter radius: ");
		double radius = entradaDados.nextDouble();
		
		double c = Calculator.circumference(radius);
		double v = Calculator.volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", Calculator.PI);

		entradaDados.close();
	}
}
