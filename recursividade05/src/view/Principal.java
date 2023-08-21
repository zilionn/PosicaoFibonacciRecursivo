package view;

import javax.swing.JOptionPane;

import controller.FibonacciController;

public class Principal {

	public static void main(String[] args) {
		FibonacciController fiboCont = new FibonacciController();
		int n = 0;
		do {
			try {
				String input = JOptionPane.showInputDialog("Digite uma posição da série de Fibonacci para saber seu número: ");
				if (input == null) {
					JOptionPane.showMessageDialog(null, "Encerrado");
					System.exit(0);
				}
				n = Integer.parseInt(input);
				if (n <= 0 || n > 20) {
					JOptionPane.showMessageDialog(null, "Número inválido, insira novamente: ");
					continue;
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Número inválido, insira novamente: ");
				continue;
				} break;
			} while(true);
		JOptionPane.showMessageDialog(null, "O número da série de Fibonacci que representa a " +n+ "ª posição é igual a: " +fiboCont.fibonacci(n));


	}

}
