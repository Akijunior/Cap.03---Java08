package Cap03;

import javax.swing.JOptionPane;

public class Cap03_Q01 {
	
	public static void main(String[] args) {
		
		double valorProduto, desconto=0;
		String nomeProduto;
		nomeProduto = JOptionPane.showInputDialog("Digite o nome do produto: ");
		valorProduto = Long.parseLong(JOptionPane.showInputDialog("Digite o valor do produto: "));
		if (valorProduto>= 50 && valorProduto < 200) {
			desconto = 5;
		}
		
		else if (valorProduto>= 200 && valorProduto < 500) {
			desconto = 6;
		}
		
		else if (valorProduto>= 500 && valorProduto < 1000) {
			desconto = 7;
		}
		
		else if (valorProduto>= 1000) {
			desconto = 8;
		}
		
		else if (valorProduto < 0) {
			System.out.println("Valor inválido!");
		}
		double precoFinal = valorProduto - (valorProduto * desconto/100);
		JOptionPane.showMessageDialog(null, "Nome do Produto: " + nomeProduto);
		JOptionPane.showMessageDialog(null, "Preço Original: " + valorProduto);
		JOptionPane.showMessageDialog(null, "Preço Final com desconto: " + precoFinal);

}


}
