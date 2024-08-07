package Entity;

import java.util.Date;
import java.util.List;

public abstract class Viagem {

	private String _placaOnibus;
	private String _nomeMotorista;
	private Date _dataViagem;
	
	private List<Passageiro> _passageiros;
	
	
	public String getPlacaOnibus() {
		return _placaOnibus;
	}
	public void setPlacaOnibus(String placaOnibus) {
		this._placaOnibus = placaOnibus;
	}
	public String getNomeMotorista() {
		return _nomeMotorista;
	}
	public void setNomeMotorista(String nomeMotorista) {
		this._nomeMotorista = nomeMotorista;
	}
	public Date getDataViagem() {
		return _dataViagem;
	}
	public void setDataViagem(Date dataViagem) {
		this._dataViagem = dataViagem;
	}
	
	public Viagem(String placaOnibus, String nomeMotorista, Date dataViagem) {
		this._placaOnibus = placaOnibus;
		this._nomeMotorista = nomeMotorista;
		this._dataViagem = dataViagem;
	}
	
	public void addPasssageiro(Passageiro passageiro) {
		int capacidade = getCapacidadeViagem();
		
		if(_passageiros.size() > capacidade) {
			_passageiros.add(passageiro);
		}
	}
	
	public void getValorTotal() {
		//float
	}
	
	
	protected abstract int getCapacidadeViagem();
	
	protected abstract float getValorTarifa();
	
}
