package hospital_app.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import hospital_app.dto.Branch;
import hospital_app.dto.MedOrder;
import hospital_app.dto.Observation;

public class ObservationDao implements ObservationInterfaceDao {

	public Observation saveObservation(Observation observation) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(observation);

		entityTransaction.commit();

		return observation;
	}

	public boolean updateObservationById(int id) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Observation observation= entityManager.find(Observation.class, id);
		if(observation!=null)
		{
			entityTransaction.begin();
			 entityManager.merge(observation);
			entityTransaction.commit();
			return true;
		}
		else
		{
			return false;
		}
		
		

	}

	public Observation getById(int id) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		return entityManager.find(Observation.class, id);

	}
}
