package sopra.formation.test;

import java.util.ArrayList;
import java.util.List;

import sopra.formation.Application;
import sopra.formation.repository.*;
import sopra.formation.model.*;

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
		IClientRepository clientRepo = Application.getInstance().getClientRepo();
		IAdresseRepository adresseRepo = Application.getInstance().getAdresseRepo();
		
		


		Particulier mat = new Particulier("Mathieu");

		
		Adresse addrMat1 = new Adresse("acacias","","59640","Dunkerque","France");
		mat = (Particulier) clientRepo.save(mat);
		
		addrMat1.setClient(mat);
		addrMat1 = adresseRepo.save(addrMat1);


		

		
	}

}
