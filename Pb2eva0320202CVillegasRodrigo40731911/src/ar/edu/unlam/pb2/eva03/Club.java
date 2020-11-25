package ar.edu.unlam.pb2.eva03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeEvento;
import ar.edu.unlam.pb2.eva03.interfaces.ICorredor;
import ar.edu.unlam.pb2.eva03.interfaces.INadador;

public class Club {

	
	private String nombre;
	private Set<Deportista> socios =new HashSet <Deportista>();
	private Map<TipoDeEvento, Evento> competencias = new HashMap <TipoDeEvento, Evento>();
	private Map<TipoDeEvento, String> competencias2 = new HashMap <TipoDeEvento, String>();
	
	public Club (String nombre) {
		this.nombre=nombre;
	}
	
	
	public void agregarDeportista(Deportista deportista) {
		socios.add(deportista);
		
	}


	public Integer getCantidadSocios() {
		return socios.size();
	}


	public void crearEvento(TipoDeEvento tipoevento, String nombre) {
		competencias.put(tipoevento, new Evento(tipoevento));
		
	}


	public Object inscribirEnEvento(String nevento, Deportista depor) throws NoEstaPreparado {
		
		if (depor instanceof ICorredor) {
			throw new NoEstaPreparado("no esta preparado");
		
			
		}
		throw new NoEstaPreparado("no esta preparado");
	}
	

	

	/*public Object inscribirEnEvento(String string, Deportista celeste) {
		
	}*/
	
}
