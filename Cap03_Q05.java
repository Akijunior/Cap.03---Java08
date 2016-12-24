package Cap03;

import javax.swing.JOptionPane;

public class Cap03_Q05 {
	
	public static void main(String[] args) {
		
		int opcaoEscolhida = Integer.valueOf(JOptionPane.showInputDialog("Digite um número correspondente a uma das opções abaixo:\n1- Exercicio 1.\n2- Exercício 2.\n3- Exercício 3.\n4- Exercício 4. "));
		switch(opcaoEscolhida) {
			
		case 1:
			cap03_Q01();
			break;
		
		case 2:
			cap03_Q02();
			break;
		
		case 3:
			cap03_Q03();
			break;
		
		case 4:
			cap03_Q04();
			break;
		}
	}
	

	public static void cap03_Q03() {
		
		String login = "java8";
		long senha = 123456;
		int contador = 3;
		while (contador > 0) {
			String loginUsuario = JOptionPane.showInputDialog("Forneça um login: ");
			long senhaUsuario = Long.parseLong(JOptionPane.showInputDialog("Forneça a senha: "));
			contador --;
			
			if (senha == senhaUsuario && login.equals(loginUsuario)) {
				JOptionPane.showMessageDialog(null, "Login e senha aceitos!");
				break;
			}
			
			else if (senha != senhaUsuario || !login.equals(loginUsuario)) {
				JOptionPane.showMessageDialog(null, "Falha, verifique login e senha!\n Você tem mais "+ contador + " tentativa(s).");
			}
			if (contador == 0) {
				JOptionPane.showMessageDialog(null, "A qtd máxima de tentativas foi alcançada. Favor tentar novamente mais tarde.");
			}
		}	
	}
	
	public static void cap03_Q01() {
		
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
	
	public static void cap03_Q02() {
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


	public static void cap03_Q04() {
			
		int valor = Integer.valueOf(JOptionPane.showInputDialog("Forneça um número: "));
		JOptionPane.showMessageDialog(null, valor + " * 1 = " + valor * 1 + ".\n" + valor + " * 2 = " + valor * 2 + ".\n" + valor + " * 3 = " + valor * 3 + ".\n" + valor + " * 4 = " + valor * 4 + ".\n" + valor + " * 5 = " + valor * 5 + ".\n" + valor + " * 6 = " + valor * 6 + ".\n" + valor + " * 7 = " + valor * 7 + ".\n" + valor + " * 8 = " + valor * 8 + ".\n" + valor + " * 9 = " + valor * 9 + ".\n" + valor + " * 10 = " + valor * 10 + ".\n");
				
		}
}


