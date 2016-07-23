package domain.adm;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="currency", schema="adm")
public class Currency implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	//@NotEmpty
	@Column(name="currency_id")
	private int id;
	
	@Column(name="currency_desc")
	private String descripcion;
	
	public Currency() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Currency(int id, String descripcion) {
		super();
		this.id = id;
		this.descripcion = descripcion;
	}
	
	public Currency(int id) {
		super();
		this.id = id;
		this.descripcion = "";
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public int getId() {
		return id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Currency [id=" + id + ", descripcion=" + descripcion + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((descripcion == null) ? 0 : descripcion.hashCode());
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Currency other = (Currency) obj;
		if (descripcion == null) {
			if (other.descripcion != null)
				return false;
		} else if (!descripcion.equals(other.descripcion))
			return false;
		if (id != other.id)
			return false;
		return true;
	}
}
