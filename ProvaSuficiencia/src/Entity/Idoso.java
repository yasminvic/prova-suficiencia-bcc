package Entity;

public class Idoso extends Passageiro {
	 
	private String rg;
	
	public Idoso(String nome, int idade) {
		super(nome, idade);
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}
}
