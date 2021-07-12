package sopra.formation.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name = "billet")
public class Billet {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Version
	private int version;
	@Column(name = "numeroPlace")
	private String numeroPlace;
	@Column(name = "classe")
	private String classe;
	@Column(name = "prix")
	private float prix;
	
	public Billet() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public String getNumeroPlace() {
		return numeroPlace;
	}

	public void setNumeroPlace(String numeroPlace) {
		this.numeroPlace = numeroPlace;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

	public float getPrix() {
		return prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}

	@Override
	public String toString() {
		return "Billet [id=" + id + ", version=" + version + ", numeroPlace=" + numeroPlace + ", classe=" + classe
				+ ", prix=" + prix + "]";
	}
	
}
