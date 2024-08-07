package Entity;

import java.util.Date;

public class Intermunicipal extends Viagem{

	public Intermunicipal(String placaOnibus, String nomeMotorista, Date dataViagem) {
		super(placaOnibus, nomeMotorista, dataViagem);
		// TODO Auto-generated constructor stub
	}
	
	private int CAPACIDADE_MAXIMA = 45;
	private float VALOR_TARIFA = 3.15f;
	
	@Override
	public int getCapacidadeViagem() {
		return CAPACIDADE_MAXIMA;
	}
	
	@Override
	public float getValorTarifa() {
		return VALOR_TARIFA;
	}
	
// 45 passageiros
	//taxa de embarque 3,15, além da tarifa

}
