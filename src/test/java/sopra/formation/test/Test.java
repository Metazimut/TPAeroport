package sopra.formation.test;

import java.util.ArrayList;
import java.util.List;

import sopra.formation.Application;
import sopra.formation.repository.*;
import sopra.formation.model.*;

public class Test {

	public static void main(String[] args) {
		IClientRepository clientRepo = Application.getInstance().getClientRepo();
		IAdresseRepository adresseRepo = Application.getInstance().getAdresseRepo();
		
		


		Particulier mat = new Particulier("Mathieu");

		
		Adresse addrMat1 = new Adresse("acacias","","59640","Dunkerque","France");
		mat = (Particulier) clientRepo.save(mat);
		
		addrMat1.setClient(mat);
		addrMat1 = adresseRepo.save(addrMat1);


		

		
	}

}
