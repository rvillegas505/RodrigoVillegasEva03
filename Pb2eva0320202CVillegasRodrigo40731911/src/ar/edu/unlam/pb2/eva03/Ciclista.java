package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBicicleta;
import ar.edu.unlam.pb2.eva03.interfaces.ICiclista;

public class Ciclista extends Deportista implements ICiclista {

	private TipoDeBicicleta tipodebicicleta;
	private String zonaPreferida;
	
	
	public Ciclista(Integer numeroDeSocio, String nombre, TipoDeBicicleta tipodebicicleta) {
		super(numeroDeSocio, nombre);
		
		this.tipodebicicleta=tipodebicicleta;
	}


	public TipoDeBicicleta getTipoDeBicicleta() {
		return tipodebicicleta;
	}


	public void setTipoDeBicicleta(TipoDeBicicleta tipodebicicleta) {
		this.tipodebicicleta = tipodebicicleta;
	}


	public String getZonaPreferida() {
		return zonaPreferida;
	}


	
	public void setZonaPreferida(String zonaPreferida) {
		this.zonaPreferida = zonaPreferida;
	}
	
	
	
	
	
}
