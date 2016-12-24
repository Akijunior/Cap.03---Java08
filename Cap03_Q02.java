package Cap03;

import javax.swing.JOptionPane;

public class Cap03_Q02 {
	
	public static void main(String[] args) {
			
			long resistencia1, resistencia2, resistencia3, resistencia4, maiorResistencia = 0, menorResistencia = 0;
			
			resistencia1 = Long.parseLong(JOptionPane.showInputDialog("Diga o valor da primeira resistêcia: "));
			resistencia2 = Long.parseLong(JOptionPane.showInputDialog("Diga o valor da segunda resistêcia: "));
			resistencia3 = Long.parseLong(JOptionPane.showInputDialog("Diga o valor da terceira resistêcia: "));
			resistencia4 = Long.parseLong(JOptionPane.showInputDialog("Diga o valor da quarta resistêcia: "));
			if (resistencia1 < resistencia2 && resistencia1 < resistencia3 && resistencia1 < resistencia4) {
				menorResistencia = resistencia1;
			}
			
			else if (resistencia2 < resistencia1 && resistencia2 < resistencia3 && resistencia2 < resistencia4) {
				menorResistencia = resistencia2;
			}
			
			else if (resistencia3 < resistencia1 && resistencia3 < resistencia2 && resistencia3 < resistencia4) {
				menorResistencia = resistencia3;
			}
			
			else if (resistencia4 < resistencia1 && resistencia4 < resistencia3 && resistencia4 < resistencia2) {
				menorResistencia = resistencia4;
			}
			
			if (resistencia1 > resistencia2 && resistencia1 > resistencia3 && resistencia1 > resistencia4) {
				maiorResistencia = resistencia1;
			}
			
			else if (resistencia2 > resistencia1 && resistencia2 > resistencia3 && resistencia2 > resistencia4) {
				maiorResistencia = resistencia2;
			}
			
			else if (resistencia3 > resistencia1 && resistencia3 > resistencia2 && resistencia3 > resistencia4) {
				maiorResistencia = resistencia3;
			}
			
			else if (resistencia4 > resistencia1 && resistencia4 > resistencia3 && resistencia4 > resistencia2) {
				maiorResistencia = resistencia4;
			}
			
			JOptionPane.showMessageDialog(null, "Resistencias fornecidas: " + resistencia1 + ", " + resistencia2 + ", " + resistencia3 + ", " + resistencia4 + ".");
			JOptionPane.showMessageDialog(null, "A Maior resistência é: " + maiorResistencia + ".");
			JOptionPane.showMessageDialog(null, "A menor resistência é: " + menorResistencia + ".");
	
	}
}
