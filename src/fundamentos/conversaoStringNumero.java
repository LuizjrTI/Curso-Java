package fundamentos;


import javax.swing.JOptionPane;

public class conversaoStringNumero {
	
	public static void main(String[] args) {
		
		String valor1 = JOptionPane.showInputDialog("Digite um n�mero:"); //cria uma caixa de dialogo
		String valor2 = JOptionPane.showInputDialog("Digite um n�mero:"); //cria uma caixa de dialogo
		
		System.out.println(valor1+valor2);
		
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		
		double total =  numero1 + numero2;
		
		System.out.println("Soma � "+ total);
		System.out.println("M�dia � "+ total/2);
		
		JOptionPane.showMessageDialog(null,"A soma dos numeros e: "+ total, null, JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog(null,"A media �: "+ total/2, null, JOptionPane.PLAIN_MESSAGE);
		
	}

}
