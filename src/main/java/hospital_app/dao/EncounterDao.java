package hospital_app.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import hospital_app.dto.Encounter;
import hospital_app.dto.Person;

public class EncounterDao implements EncounterInterfaceDao{

	public Encounter createEncounter(Encounter encounter) {
		
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(encounter);
		
		entityTransaction.commit();
		
		return encounter;
	}

	public List<Encounter> getAllEncounterByPersonId(int personId) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Person person=  entityManager.find(Person.class, personId);
		return person.getEncounter();
		
	}

	public Encounter updateEncounterStatus(int encounterId, Encounter encounter) {
		return null;
	}

	public Encounter getEncounterByPersonId(int personId) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
//		
//		Person person=  entityManager.find(Person.class, personId);
//		return person.getEncounter();
		return null;
	
	}
	

}
