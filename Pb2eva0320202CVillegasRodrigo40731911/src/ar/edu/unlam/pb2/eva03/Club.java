package ar.edu.unlam.pb2.eva03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeEvento;
import ar.edu.unlam.pb2.eva03.interfaces.ICiclista;
import ar.edu.unlam.pb2.eva03.interfaces.ICorredor;
import ar.edu.unlam.pb2.eva03.interfaces.INadador;

public class Club {

	private String nombre;
	private Set<Deportista> socios;
	private Map<String, Evento> competencias;
	
	public Club(String nombre) {
		this.nombre = nombre;
		this.socios = new HashSet<Deportista>();
		this.competencias = new HashMap<String, Evento>();
	}

	public void agregarDeportista(Deportista nuevo) {
		this.socios.add(nuevo);		
	}

	public Integer getCantidadSocios() {
		return socios.size();
	}

	public void crearEvento(TipoDeEvento tipo, String nombre) {
		competencias.put(nombre, new Evento(tipo));
	}

	public Integer inscribirEnEvento(String nombreDelEvento, Deportista aInscribir) throws NoEstaPreparado {
		Integer numeroDeInscripcion=0;
		Evento deseado = competencias.get(nombreDelEvento);
		
		switch(deseado.getTipo()) {
		case CARRERA_5K: 
		case CARRERA_10K:
		case CARRERA_21K:
		case CARRERA_42K:
			if(aInscribir instanceof ICorredor) {
				numeroDeInscripcion = deseado.agregarParticipante(aInscribir);
			}
			else {  //agregado por mi
				throw new NoEstaPreparado ("Debe ser corredor para inscribirse");
			}
			break;
		case DUATLON:
			if(aInscribir instanceof ICiclista) {
				numeroDeInscripcion = deseado.agregarParticipante(aInscribir);
			}
			else {
				throw new NoEstaPreparado("Debe ser ciclista");
			}
			break;
		case CARRERA_NATACION_EN_PICINA:
		case CARRERA_NATACION_EN_AGUAS_ABIERTAS:
			if(aInscribir instanceof INadador) {
				numeroDeInscripcion = deseado.agregarParticipante(aInscribir);
			}
			else {
				throw new NoEstaPreparado("Debe ser nadador");
			}
			break;
		case TRIATLON_SHORT:
		case TRIATLON_OLIMPICO:
		case TRIATLON_MEDIO:
		case TRIATLON_IRONMAN:
			if(aInscribir instanceof INadador && aInscribir instanceof ICiclista) {
				numeroDeInscripcion = deseado.agregarParticipante(aInscribir);
			}
			else {
				throw new NoEstaPreparado("Debe ser nadador y ciclista");
			}
			break;
		}
		return numeroDeInscripcion;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*COSAS PRE HECHAS ANTES
	 * private String nombre;
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
	
*/
	
}
