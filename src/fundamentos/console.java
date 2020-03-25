package fundamentos;

/**
 * @author Luiz Junior
 * @category Aula23
 * 
 */

import java.util.Scanner;

public class console {
	
	public static void main(String[] args) {
		
		System.out.print("Bom");
		System.out.print("dia!\n\n");
		
		System.out.println("Bom");
		System.out.println("dia!");
		
		System.out.printf("Megasena:  %d %d %d %d %d %d %n",1,2,3,4,5,6);
		
		System.out.printf("Salário: %.1f%n", 1234.5678);
		System.out.printf("Nome: %s%n", "João");
		
		Scanner entradaDeValores = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		String nome = entradaDeValores.nextLine();
		
		System.out.print("Digite seu sobrenome: ");
		String sobrenome = entradaDeValores.nextLine();
		
		System.out.print("Digite seu Idade: ");
		int idade = entradaDeValores.nextInt();
		
		System.out.println("\n\n Nome = "+nome + " "+sobrenome+ " tem "+ idade +" anos");
		
		entradaDeValores.close();
		
		
	}

}
