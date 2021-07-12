package sopra.formation.appli;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import sopra.formation.repository.IAeroportRepository;
import sopra.formation.repository.ICompagnieAerienneRepository;
import sopra.formation.repository.ICompagnieAerienneVolRepository;
import sopra.formation.repository.IVilleRepository;
import sopra.formation.repositoryJpa.AeroportRepositoryJpa;
import sopra.formation.repositoryJpa.CompagnieAerienneRepositoryJpa;
import sopra.formation.repositoryJpa.CompagnieAerienneVolRepositoryJpa;
import sopra.formation.repositoryJpa.VilleRepositoryJpa;



public class Application {
	private static Application instance = null;

	private final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("formation-jpa");

	private final IAeroportRepository aeroportRepo = new AeroportRepositoryJpa();
	private final ICompagnieAerienneVolRepository compagnieAerienneVol = new CompagnieAerienneVolRepositoryJpa();
	private final ICompagnieAerienneRepository compagnieAerienne = new CompagnieAerienneRepositoryJpa();
	private final IVilleRepository villeRepo = new VilleRepositoryJpa();
	
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
}
