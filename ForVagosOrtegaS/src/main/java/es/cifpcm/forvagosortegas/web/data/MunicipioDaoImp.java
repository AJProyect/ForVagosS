/**
 * 
 */
package es.cifpcm.forvagosortegas.web.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import es.cifpcm.forvagosortegas.model.municipio.Municipio;

/**
 * @author SAO
 *
 */
public class MunicipioDaoImp implements MunicipioDao{

	@Override
	public ArrayList<Municipio> selectAll() {
		
		Connection connect = null;
		ConnectionProvider connProv = DaoFactory.getInstance();
		ArrayList<Municipio> listadoMunicipios = new ArrayList<Municipio>();
		
		try {
			connect = connProv.getConexion();
			PreparedStatement stmt = null;

			String sql = "SELECT `id_municipio`, `id_provincia`, `cod_municipio`, `nombre` FROM `municipios`";
			stmt = connect.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Municipio municipio = new Municipio();
				municipio.setId_municipio(rs.getInt("id_municipio"));
				municipio.setId_provincia(rs.getInt("id_provincia"));
				municipio.setCod_municipio(rs.getInt("cod_municipio"));
				municipio.setNombre(rs.getString("nombre"));
				
				listadoMunicipios.add(municipio);
			}
			
			rs.close();
			stmt.close();
			connect.close();
			
			return listadoMunicipios;
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
