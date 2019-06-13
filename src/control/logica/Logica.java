package control.logica;

import java.util.ArrayList;
import java.util.Collection;

import modelo.data.Datos;
import modelo.data.Movil;
import modelo.data.Peticion;
import modelo.data.Tarifa;

public class Logica {

	Datos datos;

	public Logica() {
		super();
	}

	/**
	 * Si se le pasa una cantidad de minutos y megas retorna la tarifa más
	 * adecuada. Esta es aquella que supere tanto en minutos como en megas a la
	 * cantidad introducida por parametros. La tarifa se seleccionara por la más
	 * ceraca en megas siendo la caracteristica de minutos secundaria (aunque
	 * siempre debe superar el parametro correspondiente
	 * 
	 * Se te entrega el junit asociado para saber si has hecho bien el ejercicio
	 * 
	 * @param minutos
	 * @param megas
	 * @return
	 */
	public Tarifa obtenerMejor(int minutos, int megas) {
		// Necesito tener aqui la coleccion con todas las tarifas
		// preseleccion de las tarifas que cumplen requisitos
		return new Tarifa(0, "nula", 0, 0, 0);
	}

	/**
	 * Este metodo retorna un string que resume las caracteristicas de la tarifa
	 * tales como su nombre, minutos, megas y precio
	 * 
	 * @param tarifa
	 * @return
	 */
	public String obtenerCondiciones(Tarifa tarifa) {
		// Super sencillo
		return "no realizado";
	};

	/**
	 * Retorna el conjunto de moviles asociados a una tarifa
	 * 
	 * @param tarifa
	 * @return
	 */
	public ArrayList<Movil> obtener(Tarifa tarifa) {
		ArrayList<Movil> lista = new ArrayList<>();
		lista.add(new Movil("nulo", "nulo"));
		return lista;
	}

	/**
	 * Con los datos de una tarifa, un valor numerico que hace referencia al movil
	 * seleccionado, de entre los disponibles para esa tarifa y un numero de
	 * contacto. Almacena un objeto de tipo Peticion
	 * 
	 * @param tarifa
	 * @param selectedItem
	 * @param contacto
	 * @return
	 */
	public boolean guardaPeticion(Tarifa tarifa, int selectedItem, String contacto) {
		// Obtengo la tarifa previamente seleccionada
		// esto funciona cuando puylso el boton pedir
		// con el numero de movil seleccionado
		// guardo el movil correspondiente
		// recuerda el movil nulo (no quiere terminal)
		return false;
	}

	public Collection<Peticion> obtenerTodas() {
		//en el almacen de peticiones debo tener algo que las entregue todas
		return null;
	}
}
