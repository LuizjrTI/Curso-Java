package fundamentos;

import java.util.Scanner;

public class desafioConversão {
	
	public static void main(String[] args) {
		
		Scanner entradaDeDados = new Scanner(System.in);
		
		System.out.print("Digite o 1° Salario: ");
		String salario1 = entradaDeDados.nextLine().replace(",", ".");
		System.out.print("Digite o 2° Salario: ");
		String salario2 = entradaDeDados.nextLine().replace(",", ".");
		System.out.print("Digite o 3° Salario: ");
		String salario3 = entradaDeDados.nextLine().replace(",", ".");
		
		double sal1 = Double.parseDouble(salario1);
		double sal2 = Double.parseDouble(salario2);
		double sal3 = Double.parseDouble(salario3);
		
		double mediaSalarial = (sal1+sal2+sal3)/3;
		
				
		System.out.println("A media salarial: " + Double.toString(mediaSalarial).replace(".", ","));
		
		entradaDeDados.close();
		
		
	}

}
