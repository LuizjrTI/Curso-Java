package controle;

import javax.swing.JOptionPane;

public class ifElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String valor = JOptionPane.showInputDialog("Informe o n�mero: ");

		int numero = Integer.parseInt(valor);

		if (numero % 2 == 0) {
			
			JOptionPane.showMessageDialog(null, "N�mero Par");
			

			System.out.println("N�mero Par");
		} else {
			JOptionPane.showMessageDialog(null, "N�mero Impar");
			System.out.println("N�mero Impar");
		}

	}

}
