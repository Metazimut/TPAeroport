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
@Table(name = "Company")
public class CompagnieAerienne {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name="number")
	private String code;
	@Column(name="name")
	private String nom;
	@OneToMany(mappedBy="compagnieAerienne")
	private List<CompagnieAerienneVol> compagnieAerienneVol = new ArrayList<CompagnieAerienneVol>(); 
	

	
	
public CompagnieAerienne() {
	super();
}

public CompagnieAerienne(String code, String nom) {
	this.code=code;
	this.nom=nom;
}

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getCode() {
	return code;
}

public void setCode(String code) {
	this.code = code;
}

public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}


public List<CompagnieAerienneVol> getCompagnieAerienneVol() {
	return compagnieAerienneVol;
}

public void setCompagnieAerienneVol(List<CompagnieAerienneVol> compagnieAerienneVol) {
	this.compagnieAerienneVol = compagnieAerienneVol;
}

@Override
public String toString() {
	return "CompagnieAerienne [id=" + id + ", code=" + code + ", nom=" + nom + "]";
}



}
