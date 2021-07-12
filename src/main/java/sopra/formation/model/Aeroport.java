package sopra.formation.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "Aeroport")
public class Aeroport {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name="number")
	private Integer code;
	@Column(name="name")
	private String nom;
	@ManyToMany
	@JoinTable(name = "ville_aeroport", joinColumns = @JoinColumn(name = "aeroport_id"), inverseJoinColumns = @JoinColumn(name = "ville_id"), uniqueConstraints = @UniqueConstraint(columnNames = {
			"aeroport_id", "ville_id" }))
	private List<Ville> villes = new ArrayList<Ville>();

	
	
public Aeroport() {
	super();
}

public Aeroport(Integer code, String nom) {
	this.code=code;
	this.nom=nom;
}

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public Integer getCode() {
	return code;
}

public void setCode(Integer code) {
	this.code = code;
}

public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}

public List<Ville> getVilles() {
	return villes;
}

public void setVilles(List<Ville> villes) {
	this.villes = villes;
}

@Override
public String toString() {
	return "Aeroport [id=" + id + ", code=" + code + ", nom=" + nom + "]";
}



}
