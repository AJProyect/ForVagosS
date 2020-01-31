/**
 * 
 */
package es.cifpcm.forvagosortegas.model.municipio;

import java.io.Serializable;

/**
 * @author SAO
 *
 */
@SuppressWarnings("serial")
public class Municipio implements Serializable {

	private Integer id_municipio;
	private Integer id_provincia;
	private Integer cod_municipio;
	private String nombre;

	public Municipio() {

	}

	public Municipio(int id_municipio,int id_provincia, int cod_municipio, String nombre) {
		this.id_municipio = id_municipio;
		this.id_provincia = id_provincia;
		this.cod_municipio = cod_municipio;
		this.nombre = nombre;
	}

	public Integer getId_municipio() {
		return id_municipio;
	}

	public void setId_municipio(int id_municipio) {
		this.id_municipio = id_municipio;
	}

	public Integer getId_provincia() {
		return id_provincia;
	}

	public void setId_provincia(int id_provincia) {
		this.id_provincia = id_provincia;
	}

	public Integer getCod_municipio() {
		return cod_municipio;
	}

	public void setCod_municipio(int cod_municipio) {
		this.cod_municipio = cod_municipio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
