package sopra.formation.test;

import sopra.formation.application.Application;
import sopra.formation.model.Passager;
import sopra.formation.model.TypeIdentite;

public class Test {

	public static void main(String[] args) {
		Passager aurelienDispot = new Passager();
		aurelienDispot.setNom("Dispot");
		aurelienDispot.setPrenom("Aurelien");
		aurelienDispot.setNumeroIdentite("19552233");
		aurelienDispot.setTypeIdentite(TypeIdentite.CARTE_IDENTITE);
		
		aurelienDispot = Application.getInstance().getPassagerRepo().save(aurelienDispot);
	}

}
