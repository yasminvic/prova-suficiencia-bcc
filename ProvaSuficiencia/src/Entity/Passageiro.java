package Entity;

public class Passageiro {
	
	private String _nome;
	private int _idade;
	private float TARIFA = 5.00f;
	private float _tarifaInteira;
	

	
	public Passageiro(String nome, int idade) {
		this._nome = nome;
		this._idade = idade;
	}
	
	public String getNome() {
		return _nome;
	}
	public void setNome(String nome) {
		this._nome = nome;
	}
	public int getIdade() {
		return _idade;
	}
	public void setIdade(int idade) {
		this._idade = idade;
	}
	public float getTarifaInteira() {
		return _tarifaInteira;
	}
	public void setTarifaInteira(float tarifaInteira) {
		this._tarifaInteira = tarifaInteira;
	}

	
	public float getTarifa() {
		return this.TARIFA;
	}
}
