package sopra.formation.repository;

import java.util.List;

import sopra.formation.model.Entreprise;
import sopra.formation.model.Client;
import sopra.formation.model.Particulier;

public interface IClientRepository extends IRepository<Client, Long> {

	List<Entreprise> findAllEntrerpise();

	List<Particulier> findAllParticulier();

}
