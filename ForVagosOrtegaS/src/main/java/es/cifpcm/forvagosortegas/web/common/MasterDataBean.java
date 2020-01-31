/**
 * 
 */
package es.cifpcm.forvagosortegas.web.common;

import java.util.ArrayList;

import javax.enterprise.context.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.inject.Named;

import es.cifpcm.forvagosortegas.model.municipio.Municipio;
import es.cifpcm.forvagosortegas.model.provincia.Provincia;
import es.cifpcm.forvagosortegas.web.data.DaoFactory;
import es.cifpcm.forvagosortegas.web.data.MunicipioDao;
import es.cifpcm.forvagosortegas.web.data.ProvinciaDao;



@Named (value = "masterDataBean")
@ApplicationScoped
@ManagedBean (name = "masterDataBean")
/**
 * @author SAO
 *
 */
public class MasterDataBean {

	private final ArrayList<Provincia> listaProvincias = new ArrayList<>();
	private final ArrayList<Municipio> listaMunicipios = new ArrayList<>();

	public MasterDataBean() {
		// TODO Auto-generated constructor stub
		ProvinciaDao pdao = DaoFactory.getInstance().getProvinciasDao();
		this.listaProvincias.addAll(pdao.selectAll());
		
		MunicipioDao mdao = DaoFactory.getInstance().getMunicipioDao();
		this.listaMunicipios.addAll(mdao.selectAll());
		
	}
	
	public ArrayList<Provincia> getProvincias(){
		return this.listaProvincias;
	}
	
	public ArrayList<Municipio> getMunicipios(){
		return this.listaMunicipios;
	}
}
