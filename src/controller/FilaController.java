package controller;

import docarmo.FilaObject.Fila;

public class FilaController {
	
	int qtdf = 0, qtdfp = 0, x = 0;

	public FilaController() {
		super();
	}
	
	public Fila Inserir(Fila f, Object c) {
		f.insert(c); 
		qtdf ++;
		return f;
	}
	
	public Fila Inserirp(Fila fp, Object c) {
		fp.insert(c); 
		qtdfp++;
		return fp;
	}
	
	public void ChamaPaciente(Fila fp, Fila f) {
		if(qtdfp == 0) {
			System.out.println("A fila de prioridade esta vazia");
		}else if (x < 3){
			try {
				Object paciente = fp.remove();
				System.out.println(paciente);
				x++;
				qtdfp--;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if(qtdf == 0) {
			System.out.println("A fila de comum esta vazia\nNão há pacientes para ser atendidos");
		}else if(x == 3 || qtdfp == 0 ){
			try {
				Object paciente = f.remove();
				System.out.println(paciente);
				x = 0;
				qtdf--;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
