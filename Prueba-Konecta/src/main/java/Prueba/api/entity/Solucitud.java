package Prueba.api.entity;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="solicitud")
public class Solucitud implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
	@Column(name = "id_solicitud")
	private String id;
	@Column(name = "codigo")
	private String codigo;
	@Column(name = "descripcion")
	private String descripcion;
	@Column(name = "resumen")
	private String resumen;
	@JoinColumn(name = "id_empleado", referencedColumnName = "id_empleado")
	@ManyToOne(fetch = FetchType.EAGER)
	private Empleado id_empleado;
	
	public Solucitud() {
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Solucitud [id=" + id + ", codigo=" + codigo + ", descripcion=" + descripcion + ", resumen=" + resumen
				+ ", id_empleado=" + id_empleado + "]";
	}

	
	
	
	
}
