package ExercicioDois;

import java.util.Locale;
import java.util.Scanner;

import ExercicioDois.entities.Employee;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entradaDados = new Scanner(System.in);
		Employee emp = new Employee();

		System.out.println("SISTEMA DE CALCULO SALARIO");

		System.out.print("Name: ");
		emp.name = entradaDados.nextLine();
		System.out.print("Gross salary: ");
		emp.grossSalary = entradaDados.nextDouble();
		System.out.print("Tax: ");
		emp.tax = entradaDados.nextDouble();

		System.out.println();
		System.out.println("Employee: " + emp);
		System.out.println();

		System.out.print("Which percentage to increase salary? ");
		double percentage = entradaDados.nextDouble();
		emp.increaseSalary(percentage);

		System.out.println();
		System.out.println("Updated data: " + emp);
		entradaDados.close();
	}
}
