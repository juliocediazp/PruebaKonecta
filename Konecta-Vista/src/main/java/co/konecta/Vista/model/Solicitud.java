package co.konecta.Vista.model;

public class Solicitud {

	private String id;
	private String codigo;
	private String descripcion;
	private String resumen;
	private Empleado id_empleado;
	
	public Solicitud() {
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getResumen() {
		return resumen;
	}

	public void setResumen(String resumen) {
		this.resumen = resumen;
	}

	public Empleado getId_empleado() {
		return id_empleado;
	}

	public void setId_empleado(Empleado id_empleado) {
		this.id_empleado = id_empleado;
	}

	@Override
	public String toString() {
		return "Solicitud [id=" + id + ", codigo=" + codigo + ", descripcion=" + descripcion + ", resumen=" + resumen
				+ ", id_empleado=" + id_empleado + "]";
	}
	 
	
	
}
