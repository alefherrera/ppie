package dominio;

import specifications.ISpecification;


public class Objeto {

	private String nombre;
	private Integer cantidad;
	private ISpecification<Integer> spec;
	
	public Objeto(String nombre, Integer cantidad) {
		super();
		this.nombre = nombre;
		this.cantidad = cantidad;
	}

	public String getNombre() {
		return nombre;
	}

	public Integer getCantidad() {
		return cantidad;
	}
	
	public void setSpec(ISpecification<Integer> spec){
		this.spec = spec;
	}
	
	public ISpecification<Integer> getSpec(){
		return spec;
	}
	
	public Boolean isSatisfied()
	{
		return spec.IsSatisfiedBy(1);
	}
	
}
