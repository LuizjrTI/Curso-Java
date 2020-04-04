package controle;

import javax.swing.JOptionPane;

public class ifElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String valor = JOptionPane.showInputDialog("Informe o número: ");

		int numero = Integer.parseInt(valor);

		if (numero % 2 == 0) {
			
			JOptionPane.showMessageDialog(null, "Número Par");
			

			System.out.println("Número Par");
		} else {
			JOptionPane.showMessageDialog(null, "Número Impar");
			System.out.println("Número Impar");
		}

	}

}
