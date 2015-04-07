package dominio;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import specifications.ISpecification;

public class Universo {

	private List<Objeto> objetos;
	private Map<String, ISpecification<Integer>> condiciones;
	
	
	
	public Universo() {
		super();
		objetos = new ArrayList<Objeto>();
		condiciones = new HashMap<String, ISpecification<Integer>>();
	}

	public void AgregarObjeto(Objeto obj){
		objetos.add(obj);
	}
	
	public void AgregarCondicion(String nombre, ISpecification<Integer> condicion){
		condiciones.put(nombre, condicion);
	}
	
	/*public List<Objeto> labura(){
		
		for (Objeto item : objetos) {
			if (condiciones.get(item.getNombre()).IsSatisfiedBy(item.))
		}
	}*/
	
}
