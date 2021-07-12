package sopra.formation.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name = "client")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type")
public abstract class Client {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private Long id;
	@Version
	private int version;
	
	@Column(name = "name")
	private String nom;

	@OneToMany(mappedBy = "client")
	private List<Adresse> adresses = new ArrayList<Adresse>();

//	@OneToMany(mappedBy = "client")
//	private List<Reservation> reservations = new ArrayList<Reservation>();
	
	public Client() {
		super();
	}
	
	

	public Client(String nom, List<Adresse> adresses) {
		super();
		this.nom = nom;
		this.adresses = adresses;
	}



	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<Adresse> getAdresses() {
		return adresses;
	}

	public void setAdresses(List<Adresse> adresses) {
		this.adresses = adresses;
	}

	@Override
	public String toString() {
		return "Client [nom=" + nom + ", adresses=" + adresses + "]";
	}


	

}
