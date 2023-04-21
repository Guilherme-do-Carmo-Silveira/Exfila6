package model;

public class Cliente {
	
	public String Nome;
	public int senha;
	
	@Override
	public String toString() {
		return String.valueOf("O paciente " + Nome + " da senha " + senha + " foi chamado");
	} 
	
	
}
