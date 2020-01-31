/**
 * 
 */
package es.cifpcm.forvagosortegas.web.data;

import java.util.ArrayList;

import es.cifpcm.forvagosortegas.model.provincia.Provincia;

/**
 * @author SAO
 *
 */
public interface ProvinciaDao {
	
	public ArrayList<Provincia> selectAll();

}
