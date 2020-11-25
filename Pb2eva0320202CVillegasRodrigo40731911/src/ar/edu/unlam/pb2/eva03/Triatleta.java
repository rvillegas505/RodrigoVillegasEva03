package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBicicleta;
import ar.edu.unlam.pb2.eva03.interfaces.ICiclista;
import ar.edu.unlam.pb2.eva03.interfaces.ICorredor;
import ar.edu.unlam.pb2.eva03.interfaces.INadador;

public class Triatleta extends Deportista implements INadador, ICorredor, ICiclista {
	
	private TipoDeBicicleta tipodebicicleta;
	private String distanciaPreferida;
	
	public Triatleta(Integer numeroDeSocio, String nombre, String distanciaPreferida,
			 TipoDeBicicleta tipodebicicleta) {
		super(numeroDeSocio, nombre);
		this.tipodebicicleta = tipodebicicleta;
		this.distanciaPreferida = distanciaPreferida;
	}

	@Override
	public void setCantidadDeKilometrosEntrenados(Integer km) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Integer getCantidadDeKilometrosEntrenados() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public TipoDeBicicleta getTipoDeBicicleta() {
		return tipodebicicleta;
	}

	
	public void setTipoDeBicicleta(TipoDeBicicleta tipodebicicleta) {
		this.tipodebicicleta = tipodebicicleta;
	}

	
	public String getDistanciaPreferida() {
		return distanciaPreferida;
	}

	
	public void setDistanciaPreferida(String distanciaPreferida) {
		this.distanciaPreferida = distanciaPreferida;
	}
	
	
	
	
	
	
	
}
