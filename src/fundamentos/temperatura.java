package fundamentos;

/**
 * 
 * @author Luiz Junior
 * @category Desafio Aula 15
 *
 */

public class temperatura {
	
	public static void main(String[] args) {
		
		//(�F - 32) * 5/9 = �C
		
		double temperaturaF = 47;
		
		final int AJUSTE = 32;
		final double FATORMULTIPLICADOR = 5/9.0; //.0 � para garantir que n�o seja uma divis�o de inteiros.
		
		double temperaturaC = (temperaturaF-AJUSTE)*FATORMULTIPLICADOR;
		
		System.out.println("A temperatura em �C: " + temperaturaC);
		
	}

}
