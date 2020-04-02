package fundamentos;

import java.util.Scanner;

public class desafioCalculadora {
	
	public static void main(String[] args) {
		
		Scanner entradaDeDadosViaConsole = new Scanner(System.in);
		
		System.out.print("Digite um valor:");
		double valor1 = entradaDeDadosViaConsole.nextDouble();
		System.out.print("Digite um valor:");
		double valor2 = entradaDeDadosViaConsole.nextDouble();
		
		System.out.print("Digite a operação desejada (+ - * / %):");
		String operador = entradaDeDadosViaConsole.next();
		
		//logica
		
		double resultado = "+".equals(operador) ? valor1 + valor2 : 0;
		resultado = "-".equals(operador) ? valor1 - valor2 : resultado;
		resultado = "*".equals(operador) ? valor1 * valor2 : resultado;
		resultado = "/".equals(operador) ? valor1 / valor2 : resultado;
		resultado = "%".equals(operador) ? valor1 % valor2 : resultado;
		
		System.out.printf("%.2f  %s %.2f = %.2f", valor1,operador,valor2,resultado);
		
		entradaDeDadosViaConsole.close();
	}

}
