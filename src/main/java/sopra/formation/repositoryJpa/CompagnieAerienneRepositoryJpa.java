package sopra.formation.repositoryJpa;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import sopra.formation.appli.Application;
import sopra.formation.model.Aeroport;
import sopra.formation.model.CompagnieAerienne;
import sopra.formation.repository.ICompagnieAerienneRepository;
import sopra.formation.repository.IRepository;

public class CompagnieAerienneRepositoryJpa implements ICompagnieAerienneRepository {

	@Override
	public List<CompagnieAerienne> findAll() {
		List<CompagnieAerienne> compagnieAeriennes = new ArrayList<CompagnieAerienne>();

		EntityManager em = null;
		EntityTransaction tx = null;

		try {
			em = Application.getInstance().getEntityManagerFactory().createEntityManager();
			tx = em.getTransaction();
			tx.begin();

			TypedQuery<CompagnieAerienne> query = em.createQuery("select ca from CompagnieAerienne ca", CompagnieAerienne.class);

			compagnieAeriennes = query.getResultList();

			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null && tx.isActive()) {
				tx.rollback();
			}

		} finally {
			if (em != null) {
				em.close();
			}
		}

		return compagnieAeriennes;
	}


	@Override
	public CompagnieAerienne findById(Long id) {
		CompagnieAerienne compagnieAerienne = null;

		EntityManager em = null;
		EntityTransaction tx = null;

		try {
			em = Application.getInstance().getEntityManagerFactory().createEntityManager();
			tx = em.getTransaction();
			tx.begin();

			compagnieAerienne = em.find(CompagnieAerienne.class, id);

			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null && tx.isActive()) {
				tx.rollback();
			}

		} finally {
			if (em != null) {
				em.close();
			}
		}

		return compagnieAerienne;
	}

	@Override
	public CompagnieAerienne save(CompagnieAerienne obj) {
		EntityManager em = null;
		EntityTransaction tx = null;

		try {
			em = Application.getInstance().getEntityManagerFactory().createEntityManager();
			tx = em.getTransaction();
			tx.begin();

			obj = em.merge(obj);

			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null && tx.isActive()) {
				tx.rollback();
			}

		} finally {
			if (em != null) {
				em.close();
			}
		}

		return obj;
	}

	@Override
	public void delete(CompagnieAerienne obj) {
		EntityManager em = null;
		EntityTransaction tx = null;

		try {
			em = Application.getInstance().getEntityManagerFactory().createEntityManager();
			tx = em.getTransaction();
			tx.begin();

			em.remove(em.merge(obj));

			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null && tx.isActive()) {
				tx.rollback();
			}

		} finally {
			if (em != null) {
				em.close();
			}
		}
	}


}
