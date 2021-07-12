package sopra.formation;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import sopra.formation.repository.IAdresseRepository;
import sopra.formation.repository.IClientRepository;
import sopra.formation.repository.jpa.AdresseRepositoryJpa;
import sopra.formation.repository.jpa.ClientRepositoryJpa;


public class Application {
	private static Application instance = null;

	private final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TPAeroport");

	private final IClientRepository clientRepo = new ClientRepositoryJpa();
	private final IAdresseRepository adresseRepo = new AdresseRepositoryJpa();


	private Application() {
	}

	public static Application getInstance() {
		if (instance == null) {
			instance = new Application();
		}

		return instance;
	}

	public EntityManagerFactory getEntityManagerFactory() {
		return entityManagerFactory;
	}

	public IClientRepository getClientRepo() {
		return clientRepo;
	}

	public IAdresseRepository getAdresseRepo() {
		return adresseRepo;
	}



}
