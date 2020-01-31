/**
 * 
 */
package es.cifpcm.forvagosortegas.web.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import es.cifpcm.forvagosortegas.model.provincia.Provincia;

/**
 * @author SAO
 *
 */
public class ProvinciaDaoImp implements ProvinciaDao {

	@Override
	public ArrayList<Provincia> selectAll() {

		Connection connect = null;
		ConnectionProvider connProv = DaoFactory.getInstance();
		ArrayList<Provincia> listadoProvincias = new ArrayList<Provincia>();

		try {
			connect = connProv.getConexion();
			PreparedStatement stmt = null;

			String sql = "SELECT `id_provincia`, `nombre` FROM `provincias`";
			stmt = connect.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Provincia provincia = new Provincia();
				provincia.setId_provincia(rs.getInt("id_provincia"));
				provincia.setNombre(rs.getString("nombre"));
				
				listadoProvincias.add(provincia);
			}
			
			rs.close();
			stmt.close();
			connect.close();
			
			return listadoProvincias;
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
