package fundamentos;

public class desafioAritmeticos {
	
	public static void main(String[] args) {
		
		int a = 3 * 4 - 10;
		int b = (int) Math.pow(a, 3); // O cast foi realizado devido o metodo math retornar uma valor do tipo double
		double c = Math.pow(a, 3);
		
		System.out.println(b);
		System.out.println(c);
		
		
		//Desafio
		
		
		int x = (int) Math.pow((6 *(3+2)),2)/(3*2);
		int y = (int) Math.pow(((1-5)* (2-7))/2,2);
		
		
		double result = Math.pow(x-y, 3)/Math.pow(10, 3);
		
		System.out.println(result);
		
		
	}

}
