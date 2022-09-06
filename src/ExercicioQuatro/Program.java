package ExercicioQuatro;

import java.util.Locale;
import java.util.Scanner;

import ExercicioQuatro.entities.CurrencyConverter;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entradaDaos = new Scanner(System.in);
		
		System.out.println("SISTEMA DE COTAÇÃO DE DOLAR ");
		
		System.out.print("What is the dollar price? ");
		double dollarPrice = entradaDaos.nextDouble();
		System.out.print("How many dollars will be bought? ");
		double amount = entradaDaos.nextDouble();
		double result = CurrencyConverter.dollarToReal(amount, dollarPrice);
		System.out.printf("Amount to be paid in reais = %.2f%n", result);
		entradaDaos.close();
	}
}
