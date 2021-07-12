package sopra.formation.repositoryJpa;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import sopra.formation.appli.Application;
import sopra.formation.model.CompagnieAerienne;
import sopra.formation.model.CompagnieAerienneVol;
import sopra.formation.repository.ICompagnieAerienneVolRepository;

public class CompagnieAerienneVolRepositoryJpa implements ICompagnieAerienneVolRepository {

	@Override
	public List<CompagnieAerienneVol> findAll() {
		List<CompagnieAerienneVol> compagnieAeriennesvols = new ArrayList<CompagnieAerienneVol>();

		EntityManager em = null;
		EntityTransaction tx = null;

		try {
			em = Application.getInstance().getEntityManagerFactory().createEntityManager();
			tx = em.getTransaction();
			tx.begin();

			TypedQuery<CompagnieAerienneVol> query = em.createQuery("select cav from CompagnieAerienneVol cav", CompagnieAerienneVol.class);

			compagnieAeriennesvols = query.getResultList();

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

		return compagnieAeriennesvols;
	}


	@Override
	public CompagnieAerienneVol findById(Long id) {
		CompagnieAerienneVol compagnieAerienneVol = null;

		EntityManager em = null;
		EntityTransaction tx = null;

		try {
			em = Application.getInstance().getEntityManagerFactory().createEntityManager();
			tx = em.getTransaction();
			tx.begin();

			compagnieAerienneVol = em.find(CompagnieAerienneVol.class, id);

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

		return compagnieAerienneVol;
	}

	@Override
	public CompagnieAerienneVol save(CompagnieAerienneVol obj) {
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
	public void delete(CompagnieAerienneVol obj) {
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
