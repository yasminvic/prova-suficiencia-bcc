package Entity;

public class Estudante extends Passageiro{

	private String _escola;
	
	public Estudante(String nome, int idade, String escola) {
		super(nome, idade);
		this._escola = escola;
	}
	
	public String getEscola() {
		return _escola;
	}

	public void setEscola(String escola) {
		this._escola = escola;
	}
	
	@Override
	public float getTarifa() {
		return super.getTarifa() / 2;
	}
	

}
