package fundamentos;

public class atribuicao {

	public static void main(String[] args) {

		int a = 3;
		int b = a;
		int c = a + b;

		c += b; // c = c + b;
		c -= b; // c = c - b;
		c *= b; // c = c * b;
		c /= b; // c = c / b;

		System.out.println(c);

		c %= b; // c = c % b; Opera��o de modulo

		System.out.println(c);

	}

}
