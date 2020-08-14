package co.konecta.Vista.model;

public class Empleado {


	private String id;
	private String fechaIngreso;
	private String nombre;
	private String salario;
	
	public Empleado() {
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSalario() {
		return salario;
	}

	public void setSalario(String salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Empleado [id=" + id + ", fechaIngreso=" + fechaIngreso + ", nombre=" + nombre + ", salario=" + salario
				+ "]";
	}
	
	
	
}
