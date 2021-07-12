package sopra.formation.model;



import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;


@Entity
@DiscriminatorValue("company")
public class Entreprise extends Client {
	
	@Column(name = "siret")
	private String siret;
	@Column(name = "tvaNumber")
	private String numeroTva;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "legalStatus ")
	private StatutJuridique statutJuridique;

	public Entreprise() {
		super();
	}

	public Entreprise(String siret, String numeroTva, StatutJuridique statutJuridique) {
		super();
		this.siret = siret;
		this.numeroTva = numeroTva;
		this.statutJuridique = statutJuridique;
	}

	public String getSiret() {
		return siret;
	}

	public void setSiret(String siret) {
		this.siret = siret;
	}

	public String getNumeroTva() {
		return numeroTva;
	}

	public void setNumeroTva(String numeroTva) {
		this.numeroTva = numeroTva;
	}

	public StatutJuridique getStatutJuridique() {
		return statutJuridique;
	}

	public void setStatutJuridique(StatutJuridique statutJuridique) {
		this.statutJuridique = statutJuridique;
	}

	@Override
	public String toString() {
		return "Entreprise [siret=" + siret + ", numeroTva=" + numeroTva + ", statutJuridique=" + statutJuridique + "]";
	}

	

}
