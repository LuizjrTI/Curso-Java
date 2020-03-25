package fundamentos;

public class tipoString {

	public static void main(String[] args) {
	
		
		System.out.println("Olá mundo".charAt(2));
		
		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.toUpperCase().endsWith("TARDE"));
		System.out.println(s.length());
		System.out.println(s.equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));//ignora os letras maiusculas ou minusculas
		
		
		String nome = "Pedro";
		String sobrenome = "Santos";
		int idade = 33;
		double salario = 12345.987;
		
		
		System.out.println("Nome: "+ nome+ 
				"\nSobrenome: "+ sobrenome+ 
				"\nIdade: "+idade+ 
				"\nSalario: "+salario+
				"\n\n" );
		
		System.out.printf("O senhor %s %s tem %d anos e ganha %.2f.\n",
				nome,sobrenome,idade,salario);
		
		System.out.println("frase");
		
		System.out.println("Frase qualquer".contains("qual"));
		System.out.println("Frase qualquer".indexOf("qual"));
		System.out.println("Frase qualquer".substring(6)); //6 em diante
		System.out.println("Frase qualquer".substring(6,10));// 6 até 9
		
	}

}
