package controle;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {

		// O nome da classe foi maiusculo porque if � uma palavra reservada

		Scanner entradeDeDados = new Scanner(System.in);

		System.out.print("Insira a m�dia: ");
		double media = entradeDeDados.nextDouble();

		if (media <= 10 && media >= 7.0) {
			System.out.println("Aluno Aprovado");
			System.out.println("Parabens");
		}
		if (media < 7 && media >= 4.5) {
			System.out.println("Recupera��o");
		}
		if (media <= 4.5 && media >= 0) {
			System.out.println("Reprovado");
		}

		entradeDeDados.close();
	}

}
