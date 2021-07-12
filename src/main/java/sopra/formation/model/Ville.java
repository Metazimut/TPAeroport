package sopra.formation.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "city")

public class Ville {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name="name")
	private String nom;
	@ManyToMany(mappedBy = "villes")
	private List<Aeroport> aeroports = new ArrayList<Aeroport>();

	
	


public Ville(){
	super();
}

public Ville(String nom) {
	this.nom=nom;
}




public long getId() {
	return id;
}




public void setId(long id) {
	this.id = id;
}




public String getNom() {
	return nom;
}




public void setNom(String nom) {
	this.nom = nom;
}




public List<Aeroport> getAeroports() {
	return aeroports;
}

public void setAeroports(List<Aeroport> aeroports) {
	this.aeroports = aeroports;
}

@Override
public String toString() {
	return "Ville [id=" + id + ", nom=" + nom + "]";
}


}