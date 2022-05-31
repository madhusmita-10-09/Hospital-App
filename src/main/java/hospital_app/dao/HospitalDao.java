package hospital_app.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import hospital_app.dto.Hospital;

public class HospitalDao implements HospitalInterfaceDao {
	
	public  Hospital saveHospital(Hospital hospital)
	{
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		

	    entityTransaction.begin();
	    entityManager.persist(hospital);
	    
		entityTransaction.commit();
		System.out.println("Hospital saved");
		return hospital;
	}
	public List<Hospital> getAllHospital()
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		String sql="SELECT h FROM Hospital h";
		Query query=entityManager.createQuery(sql);
		return query.getResultList();
	}
	public Hospital getHospitalById(int id)
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Hospital hospital= entityManager .find(Hospital.class,id);
		if (hospital != null) {
			System.out.println("id is :"+hospital.getHospitalId());
			System.out.println("Name is: " +hospital.getName());
			System.out.println("Email is:" + hospital.getGstNumber());
		} else {
            return hospital;
		}
		return null;
		
	}


}
