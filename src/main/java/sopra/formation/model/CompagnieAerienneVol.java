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
	private CompagnieAerienne compagnieAerienne;
	@ManyToOne
	@JoinColumn(name="vol_id")
	private Vol vol;
	
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



public Vol getVol() {
	return vol;
}

public void setVols(Vol vol) {
	this.vol = vol;
}

public CompagnieAerienne getCompagnieAerienne() {
	return compagnieAerienne;
}

public void setCompagnieAerienne(CompagnieAerienne compagnieAerienne) {
	this.compagnieAerienne = compagnieAerienne;

}

@Override
public String toString() {
	return "CompagnieAerienneVol [id=" + id + ", numeroVol=" + numeroVol + "]";
}


}
