/**
 * 
 */
package es.cifpcm.forvagosortegas.model.provincia;

import java.io.Serializable;

/**
 * @author SAO
 *
 */
@SuppressWarnings("serial")
public class Provincia implements Serializable {
	
	private Integer id_provincia;
	private String nombre;
	
	public Provincia() {
		
	}
	
	public Provincia(int id_provincia, String nombre) {
		this.id_provincia = id_provincia;
		this.nombre = nombre;
	}

	public Integer getId_provincia() {
		return id_provincia;
	}

	public void setId_provincia(int id_provincia) {
		this.id_provincia = id_provincia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

}
