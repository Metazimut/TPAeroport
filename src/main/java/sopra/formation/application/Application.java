package sopra.formation.application;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import sopra.formation.repository.IBilletRepository;
import sopra.formation.repository.IPassagerRepository;
import sopra.formation.repository.IReservationRepository;
import sopra.formation.repository.IVolRepository;
import sopra.formation.repository.jpa.BilletRepositoryJpa;
import sopra.formation.repository.jpa.PassagerRepositoryJpa;
import sopra.formation.repository.jpa.ReservationRepositoryJpa;
import sopra.formation.repository.jpa.VolRepositoryJpa;

public class Application {
	private static Application instance = null;
	
	private final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("tpaeroport");

	private final IBilletRepository billetRepo = new BilletRepositoryJpa();
	private final IPassagerRepository passagerRepo = new PassagerRepositoryJpa();
	private final IReservationRepository reservationRepo = new ReservationRepositoryJpa();
	private final IVolRepository volRepo = new VolRepositoryJpa();

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