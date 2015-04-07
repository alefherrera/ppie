package dominio;

import specifications.ISpecification;

public class Objeto {

	private String nombre;
	private Integer cantidad;
	
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
	
}
