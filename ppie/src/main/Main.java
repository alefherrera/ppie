package main;

import specifications.ISpecification;
import conditions.BiggerThan;
import dominio.Objeto;
import dominio.Universo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Universo u = new Universo();
		
		ISpecification<Integer> c = new BiggerThan(3).Not();
		Objeto manzanas = new Objeto("manzanas", 20);
		manzanas.setSpec(c);
		Objeto naranjas = new Objeto("naranjas", 20);
		naranjas.setSpec(c);
		
		u.AgregarObjeto(manzanas);
		u.AgregarObjeto(naranjas);
		u.setTotal(12);
		
		//N - comb de 2, comb de 3, comb de 4
		
		//naranjas + manzanas = 12
		//N - N(spec)... + N(spec.and(spec2) ... - N(spec.and(spec2).and(spec3))
		
		//condiciones.lenght = 3 -> pasar a binario
		
		//N(specs[0] - specs[1] - specs[2]
		//N(specs[0].and(spec[1]) + specs
		
		//System.out.println(s.IsSatisfiedBy(2));
	}
}
