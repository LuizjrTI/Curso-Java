package fundamentos;

public class unarios {

	public static void main(String[] args) {

		int a = 1;
		int b = 2;

		a++;
		a--;

		++b;
		--b;

		/*
		 * No caso de operadores Unarios:
		 * 
		 * Posfix (a++) -> Primeiro exibisse o valor da variavel e depois incrementa.
		 * 
		 * Prefix (++a) -> Primeiro incrementa o valor e exibe depois
		 * 
		 */

		System.out.println(a);
		System.out.println(b);

		System.out.println("Mini Desafio");
		System.out.println(++a == b--);
		System.out.println(a == b);
		System.out.println(a);
		System.out.println(b);

	}

}
