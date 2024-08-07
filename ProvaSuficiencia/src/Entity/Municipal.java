package Entity;

import java.util.Date;

public class Municipal extends Viagem{

	public Municipal(String placaOnibus, String nomeMotorista, Date dataViagem) {
		super(placaOnibus, nomeMotorista, dataViagem);
		// TODO Auto-generated constructor stub
	}
	
	private int CAPACIDADE_MAXIMA = 65;
	
	@Override
	public int getCapacidadeViagem() {
		return CAPACIDADE_MAXIMA;
	}
	
	@Override
	public float getValorTarifa() {
		return 0.00f;
	}
//maximo passageiros 65 => 30 sentados e 35 em pe
	

}
