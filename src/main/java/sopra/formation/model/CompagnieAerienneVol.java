package sopra.formation.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "FlightCompany")
public class CompagnieAerienneVol {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name="flightNumber")
	private String numeroVol;
	@ManyToOne
	@JoinColumn(name="cie_id")
	private List<CompagnieAerienne> compagnieAerienne = new ArrayList<CompagnieAerienne>();
	@ManyToOne
	@JoinColumn(name="vol_id")
	private List<Vol> vol = new ArrayList<Vol>();
	
public CompagnieAerienneVol() {
	super();
}

public CompagnieAerienneVol(String numeroVol) {
	this.numeroVol=numeroVol;
}

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getNumeroVol() {
	return numeroVol;
}

public void setNumeroVol(String numeroVol) {
	this.numeroVol = numeroVol;
}


public List<Vol> getVols() {
	return vols;
}

public void setVols(List<Vol> vols) {
	this.vols = vols;
}

public List<CompagnieAerienne> getCompagnieAerienne() {
	return compagnieAerienne;
}

public void setCompagnieAerienne(List<CompagnieAerienne> compagnieAerienne) {
	this.compagnieAerienne = compagnieAerienne;
}

@Override
public String toString() {
	return "CompagnieAerienneVol [id=" + id + ", numeroVol=" + numeroVol + "]";
}


}
