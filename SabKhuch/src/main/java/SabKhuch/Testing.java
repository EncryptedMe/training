package SabKhuch;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class Testing {

	public static void main(String[] args) {
		
		//List<Alpha> list = new ArrayList<>();
		/*
		 * Alpha a1=new Alpha(), a2,a3; a2 =new Alpha(); a3 =new Alpha();
		 * a1.setAplhaName("Sajal"); a2.setAplhaName("Shivank");
		 * a3.setAplhaName("Rishab");
		 */
		
		EntityManager em = Persistence.createEntityManagerFactory("ku").createEntityManager();
		em.getTransaction().begin();		
		/*
		 * em.persist(a1); em.persist(a2); em.persist(a3);
		 */
		Alpha a=em.find(Alpha.class,1);
		em.remove(a);
		//a.setAplhaName("Sajal Gupta");
		
		em.getTransaction().commit();
		

	}

}
