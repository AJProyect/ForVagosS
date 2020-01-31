/**
 * 
 */
package es.cifpcm.forvagosortegas.model.customer;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * @author SAO
 *
 */
@SuppressWarnings("serial")
public class Customer implements Serializable {
	
	private int customer_id;
	private String first_name;
	private String last_name;
	private int telefono;
	private String email;
	private Timestamp fecha_de_nacimiento;
	
	public Customer() {
		
	}
	
	public Customer(int customer_id, String first_name, String last_name, int telefono, String email,
			Timestamp fecha_de_nacimiento) {
		this.customer_id = customer_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.telefono = telefono;
		this.email = email;
		this.fecha_de_nacimiento = fecha_de_nacimiento;
	}

	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Timestamp getFecha_de_nacimiento() {
		return fecha_de_nacimiento;
	}

	public void setFecha_de_nacimiento(Timestamp fecha_de_nacimiento) {
		this.fecha_de_nacimiento = fecha_de_nacimiento;
	}
}
