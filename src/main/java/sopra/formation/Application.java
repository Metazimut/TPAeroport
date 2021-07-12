package sopra.formation;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import sopra.formation.repository.IAdresseRepository;
import sopra.formation.repository.IAeroportRepository;
import sopra.formation.repository.IBilletRepository;
import sopra.formation.repository.IClientRepository;
import sopra.formation.repository.ICompagnieAerienneRepository;
import sopra.formation.repository.ICompagnieAerienneVolRepository;
import sopra.formation.repository.IPassagerRepository;
import sopra.formation.repository.IReservationRepository;
import sopra.formation.repository.IVilleRepository;
import sopra.formation.repository.IVolRepository;
import sopra.formation.repository.jpa.AdresseRepositoryJpa;
import sopra.formation.repository.jpa.BilletRepositoryJpa;
import sopra.formation.repository.jpa.ClientRepositoryJpa;
import sopra.formation.repository.jpa.PassagerRepositoryJpa;
import sopra.formation.repository.jpa.ReservationRepositoryJpa;
import sopra.formation.repository.jpa.VolRepositoryJpa;
import sopra.formation.repositoryJpa.AeroportRepositoryJpa;
import sopra.formation.repositoryJpa.CompagnieAerienneRepositoryJpa;
import sopra.formation.repositoryJpa.CompagnieAerienneVolRepositoryJpa;
import sopra.formation.repositoryJpa.VilleRepositoryJpa;


public class Application {
	private static Application instance = null;

	private final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TPAeroport");

	private final IClientRepository clientRepo = new ClientRepositoryJpa();
	private final IAdresseRepository adresseRepo = new AdresseRepositoryJpa();
	private final IBilletRepository billetRepo = new BilletRepositoryJpa();
	private final IPassagerRepository passagerRepo = new PassagerRepositoryJpa();
	private final IReservationRepository reservationRepo = new ReservationRepositoryJpa();
	private final IVolRepository volRepo = new VolRepositoryJpa();
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

	public IClientRepository getClientRepo() {
		return clientRepo;
	}

	public IAdresseRepository getAdresseRepo() {
		return adresseRepo;
	}


	public IBilletRepository getBilletRepo() {
		return billetRepo;
	}

	public IPassagerRepository getPassagerRepo() {
		return passagerRepo;
	}

	public IReservationRepository getReservationRepo() {
		return reservationRepo;
	}

	public IVolRepository getVolRepo() {
		return volRepo;
	}

}
