package hospital_app.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import hospital_app.dto.Address;
import hospital_app.dto.Branch;
import hospital_app.dto.Person;
import hospital_app.dto.User;

public class PersonDao implements PersonInterfaceDao{

	public Person savePerson(Person person) {
		
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(person);
		
		entityTransaction.commit();
		
		return person;
		
	}

	public Person getPersonById(int id) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager enityManager=entityManagerFactory.createEntityManager();
	
		
		Person person=enityManager.find(Person.class,id);
		if(person!=null)
		{
			System.out.println("person id :"+person.getPersonId());
			System.out.println("name :"+person.getName());
			System.out.println("person age :"+person.getAge());
			System.out.println("person email: "+person.getEmail());
			System.out.println("person "+person.getPhone());
			System.out.println("person :"+person.getDob());
			System.out.println("person: "+person.getBloodGroup());
		}
		else
		{
			System.out.println("No record to deelect");
		}
		
		return null;
		
	}

	public Person updatePersonById(int id, Person person) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Person person1=entityManager.find(Person.class, id);
		if(person1!=null)
			
		{
			entityTransaction.begin();
			entityManager.merge(person1);
			entityTransaction.commit();
			return entityManager.find(Person.class,id);
		}
		else
		{
			return null;
		
	   }
		
	}

	public List<Person> getAllPerson() {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		String sql="SELECT p FROM Person p";
		Query query=entityManager.createQuery(sql);
		return query.getResultList();
		
	}

	public boolean deletePersonById(int id) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager enityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=enityManager.getTransaction();
		
		Person person=enityManager.find(Person.class,id);
		if(person!=null)
		{
			entityTransaction.begin();
			enityManager.remove(person);
			entityTransaction.commit();
			System.out.println("delecting id is: "+id);
		}
		else
		{
			System.out.println("No record to deelect");
		}
		
		return false;

	}

}
