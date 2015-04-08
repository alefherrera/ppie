package dominio;

import java.util.ArrayList;
import java.util.List;

import specifications.ISpecification;
import utils.MathUtils;
import conditions.Condition;

public class Universo {

	private List<Objeto> objetos;
	private Integer total = 0;

	public Universo() {
		super();
		objetos = new ArrayList<Objeto>();
	}

	public void AgregarObjeto(String nombre, Integer cantidad) {
		objetos.add(new Objeto(nombre, cantidad));
	}

	public void AgregarObjeto(Objeto obj) {
		objetos.add(obj);
	}

	public void setTotal(Integer cant){
		total = cant;
	}
	
	// public void AgregarCondicion(String nombre,
	// ISpecification<Integer> condicion) {
	// objetos
	// condiciones.put(nombre, condicion);
	// }
	//
	// public void AgregarCondicion(String[] nombres,
	// ISpecification<Integer> condicion) {
	// for (String string : nombres) {
	// AgregarCondicion(string, condicion);
	// }
	// }

	
	/*
	 * X1 + X2 + X3 = 100
	 * 
	 * N - N(alfa)
	 * 
	 */
	
	
	
	/*
	 * N
	 */
	public int CalculateUniverso() {
		return MathUtils.Combination(total-1, objetos.size()-1);
	}


	public int CalculateSpecAnswers(Objeto o ,ISpecification<Integer> spec){
		
		return 1;
	}
	
	
	public int CalculateAnswers(){
		ArrayList<ISpecification<Integer>> propiedades = new ArrayList<ISpecification<Integer>>();
		for (Objeto obj : objetos)
			propiedades.add(obj.getSpec());
		
		//N
		int respuestasTotales = CalculateUniverso();
		
		
		
		for (int i = 0; i < propiedades.size(); i++) {
			CalculateSpecAnswers(objetos.get(0),propiedades.get(i));
			for (int j = 0; j < propiedades.size()-1; j++) {
				if (j != i)
					CalculateSpecAnswers(objetos.get(0),((Condition)propiedades.get(i)).And(propiedades.get(j)));
			}
		}
		
		
		return 1;
	}
	
	
	
	
	/*
	 * public List<Objeto> labura(){
	 * 
	 * for (Objeto item : objetos) { if
	 * (condiciones.get(item.getNombre()).IsSatisfiedBy(item.)) } }
	 */

}
