package ar.edu.unlam.pb2.eva03;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Club {

	private String nombre;
	private Set<Deportista> socios =new HashSet <Deportista>();
	private Map<String, Evento> competencias;
	
	public Club (String nombre) {
		this.nombre=nombre;
	}
	
	
	public void agregarDeportista(Deportista deportista) {
		socios.add(deportista);
		
	}


	public Integer getCantidadSocios() {
		return socios.size();
	}
	
}
