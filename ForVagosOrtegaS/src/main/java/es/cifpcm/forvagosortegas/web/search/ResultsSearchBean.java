package es.cifpcm.forvagosortegas.web.search;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@SuppressWarnings("serial")
@Named("resultsSearchBean")
@RequestScoped
public class ResultsSearchBean implements Serializable {
	
	private Integer idMunicipioSelect;
	
	@Inject
	HotelSearchBean hotelsearchbean;
	
	@PostConstruct
	public void init() {
		this.idMunicipioSelect = hotelsearchbean.getIdMunicipio();
	}

	public ResultsSearchBean() {
		// TODO Auto-generated constructor stub
	}
	
	
	//ID MUNICIPIO SELECTED
	public Integer getIdMunicipioSelect() {
		return idMunicipioSelect;
	}

	public void setIdMunicipioSelect(Integer idMunicipioSelect) {
		this.idMunicipioSelect = idMunicipioSelect;
	}	
	
}
