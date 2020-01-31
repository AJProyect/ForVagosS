/**
 * 
 */
package es.cifpcm.forvagosortegas.model.hotel;

import java.io.Serializable;

/**
 * @author SAO
 *
 */
@SuppressWarnings("serial")
public class Hotel implements Serializable {

	private int hotel_id;
	private int id_municipio;
	private int price;
	private String name;	
	private String hotel_picture;
	
	public Hotel() {
		
	}
	
	public Hotel(int hotel_id, int id_municipio, int price, String name, String hotel_picture) {
		this.hotel_id = hotel_id;
		this.id_municipio = id_municipio;
		this.price = price;
		this.name = name;
		this.hotel_picture = hotel_picture;
	}

	public int getHotel_id() {
		return hotel_id;
	}

	public void setHotel_id(int hotel_id) {
		this.hotel_id = hotel_id;
	}

	public int getId_municipio() {
		return id_municipio;
	}

	public void setId_municipio(int id_municipio) {
		this.id_municipio = id_municipio;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHotel_picture() {
		return hotel_picture;
	}

	public void setHotel_picture(String hotel_picture) {
		this.hotel_picture = hotel_picture;
	}
	
	
	
}
