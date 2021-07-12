package sopra.formation.model;


import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


@Entity
@DiscriminatorValue("individuals")
public class Particulier extends Client {
	
	@Column(name = "firstName")
	private String prenom;
	
	public Particulier() {
		super();
	}
	
	

	public Particulier(String prenom) {
		super();
		this.prenom = prenom;
	}



	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	@Override
	public String toString() {
		return "Particulier [prenom=" + prenom + "]";
	}

	

}
