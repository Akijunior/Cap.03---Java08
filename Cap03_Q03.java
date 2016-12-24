package Cap03;

import javax.swing.JOptionPane;

public class Cap03_Q03 {
	
	public static void main(String[] args) {
		
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
	

}
