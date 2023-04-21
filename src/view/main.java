package view;

import javax.swing.JOptionPane;

import controller.FilaController;
import docarmo.FilaObject.Fila;
import model.Cliente;

public class main {

	public static void main(String[] args) {

		Fila f = new Fila();
		Fila fp = new Fila();
		FilaController control = new FilaController();
		int opc = 0, senha = 0, senhap = 0;

		while (opc != 8) {
			Cliente c = new Cliente();
			opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Fila Comum\n2 - Fila Prioritaria\n3 - Chamar um Paciente\n8 - finalizar"));
			switch (opc) {
			case 1:
				c.Nome = JOptionPane.showInputDialog("Insira seu Nome");
				c.senha = Integer.parseInt(JOptionPane.showInputDialog("Insira sua senha"));
				f = control.Inserir(f, c);
				break;
			case 2:
				c.Nome = JOptionPane.showInputDialog("Insira seu Nome");
				c.senha = Integer.parseInt(JOptionPane.showInputDialog("Insira sua senha"));
				fp = control.Inserirp(fp, c);
				break;
			case 3:
				control.ChamaPaciente(fp, f);
				break;
			case 8:
				JOptionPane.showMessageDialog(null, "Programa finalizado");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção Invalida");

			}
		}

	}

}
