package fundamentos;

/**
 * 
 * @author Luiz Junior
 * @category Aula20
 *
 */

public class notacaoPonto {
	
	public static void main(String[] args) {
		
		
		String s = "Bom dia x";
		s = s.replace("x","Senhor");
		s = s.toUpperCase();
		s = s.concat("!!!");
		System.out.println(s);

		String x = "leo".toUpperCase();
		System.out.println(x);
		
		String y = "Bom dia X"
				.replace("X", x)
				.toUpperCase()
				.concat("!!!");
		
		System.out.println(y);
		
		
		//Tipos primitivos não te o operador "."
		
		int a = 3;
		System.out.println(a);
		
		
		
	}

}
