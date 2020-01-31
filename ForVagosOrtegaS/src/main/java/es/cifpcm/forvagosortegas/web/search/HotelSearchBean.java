package es.cifpcm.forvagosortegas.web.search;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import es.cifpcm.forvagosortegas.model.municipio.Municipio;
import es.cifpcm.forvagosortegas.model.provincia.Provincia;
import es.cifpcm.forvagosortegas.web.common.MasterDataBean;

@SuppressWarnings("serial")
@Named(value = "hotelSearchBean")
@RequestScoped
/**
 * @author SAO
 *
 */
public class HotelSearchBean implements Serializable {	

	private Integer idProvincia;
	private Integer idMunicipio;
	
	private Date minDate;	
    private Date maxDate;  
    private Integer diffDates;

	private ArrayList<Provincia> listadoProvincia;
	private ArrayList<Municipio> listadoMunicipio;
	private ArrayList<Municipio> filtroMunicipios;

	@Inject
	MasterDataBean masterdatabean;

	@PostConstruct
	public void init() {
		Date today = new Date();
		long oneDay = 24 * 60 * 60 * 1000;
		
		minDate = new Date();
		maxDate = new Date(today.getTime() + (30 * oneDay));
		
		this.listadoProvincia = masterdatabean.getProvincias();
		this.listadoMunicipio = masterdatabean.getMunicipios();
	}
	
	

	public HotelSearchBean() {
		// TODO Auto-generated constructor stub
	}

	// LISTADO PROVINCIA.
	public ArrayList<Provincia> getListadoProvincia() {
		return listadoProvincia;
	}

	public void setListadoProvincia(ArrayList<Provincia> listadoProvincia) {
		this.listadoProvincia = listadoProvincia;
	}

	// LISTADO MUNICIPIO
	public ArrayList<Municipio> getListadoMunicipio() {
		return listadoMunicipio;
	}
	
	public void setListadoMunicipio(ArrayList<Municipio> listadoMunicipio){
		this.listadoMunicipio = listadoMunicipio;
	}	
	
	
	// ID PROVINCIA
	public Integer getIdProvincia() {
		return idProvincia;
	}

	public void setIdProvincia(Integer idProvincia) {
		this.idProvincia = idProvincia;
	}

	
	// ID MUNICIPIO
	public Integer getIdMunicipio() {
		return idMunicipio;
	}

	public void setIdMunicipio(Integer idMunicipio) {
		this.idMunicipio = idMunicipio;
	}
	
	// FECHA MINIMA
	public Date getMinDate() {
		return minDate;
	}
	
	public void setMinDate(Date minDate) {
		this.minDate = minDate;
	}
	

	// FECHA MAXIMA
	public Date getMaxDate() {
		return maxDate;
	}

	public void setMaxDate(Date maxDate) {
		this.maxDate = maxDate;
	}
	
	
	// DAYS DIFF
	public Integer getDiffDates() {
		return diffDates;
	}

	public void setDiffDates(Integer diffDates) {
		this.diffDates = diffDates;
	}


	// LISTADO FILTRADO.
	public ArrayList<Municipio> getFiltroMunicipios() {
		return filtroMunicipios;
	}
	
	public void setFiltroMunicipios(ArrayList<Municipio> filtroMunicipios) {
		this.filtroMunicipios = filtroMunicipios;
	}
	

	// METODO ON CHANGE.
	public ArrayList<Municipio> onCboProvinciasChange() {
		if (this.idProvincia != null) {
			filtroMunicipios = new ArrayList<Municipio>();

			for (Municipio municipio : listadoMunicipio) {
				if (municipio.getId_provincia() == this.idProvincia) {
					filtroMunicipios.add(municipio);
				}
			}

			return filtroMunicipios;
		} else {
			return listadoMunicipio;
		}

	}

}
