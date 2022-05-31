package hospital_app.dao;

import java.util.ArrayList;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import hospital_app.dto.Branch;
import hospital_app.dto.Hospital;

public class BranchDao implements BranchInterfaceDao {

	//Save branch- it will inserted the data in to the database and save the data inside the database//
	public Branch saveBranch(Branch branch) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		
		entityTransaction.begin();
		entityManager.persist(branch);
		entityTransaction.commit();
		System.out.println("branch added");
		return branch;

	}

	// get branch details by using id,if id is present in your database then it will give data else
	//no id is present in your database//
	public Branch getBranchById(int id) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		return entityManager.find(Branch.class, id);
	}

	public List<Branch> getAllBranchHospitalById(int id) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		String sql="SELECT b FROM Branch b WHERE b.id=?1";
		Query query=entityManager.createQuery(sql);
		query.setParameter(1, id);
		List<Branch> branchs=new ArrayList<Branch>();
		return query.getResultList();
		
	}

	public Branch updateBranchById(int id, Branch branch) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager enityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=enityManager.getTransaction();
		entityTransaction.begin();
		enityManager.merge(branch);
		entityTransaction.commit();
		
		
		return null;
	}

	// Delete branch by using id//
	//here it will delete the data inside the branch if you have given the existing id else it will give
	//no id is present in your database//
	public boolean deleteBranchById(int id) {
			EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
			EntityManager enityManager=entityManagerFactory.createEntityManager();
			EntityTransaction entityTransaction=enityManager.getTransaction();
			
			Branch branch=enityManager.find(Branch.class,id);
			if(branch!=null)
			{
				entityTransaction.begin();
				enityManager.remove(branch);
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
