package MappingRelation2;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class MainMapping {

	public static void main(String[] args) {
		try {
		Session s = new Configuration().configure().buildSessionFactory().openSession();
		
		s.beginTransaction();
		 ClassRoom c1a, c1b, c1c;
		 Teacher t1,t2,t3,t4,t5;
		  t1 = new Teacher("t1", "Ramesh"); 
		  t2 = new Teacher("t2", "Prajjwal"); 
		  t3 = new Teacher("t3", "Sajal"); 
		  t4 = new Teacher("t4", "Perry"); 
		  t5 = new Teacher("t5", "Tank"); 
		  c1a = new ClassRoom("1a",98,t1); 
		  c1b = new ClassRoom("1b",95,t2); 
		  c1c = new ClassRoom("1c",89,t3);
		  s.save(c1c);s.save(c1b);s.save(c1a);
		
//		Employee e1,e2,e4,e5,e3;
//		e1 =new Employee(101,"Sajal");
//		e2 =new Employee(102,"Shivank");
//		e3 =new Employee(103,"Rishab");
//		e4 =new Employee(104,"Rony");
//		e5 = new Employee(106,"Darsh");
//		Department d1,d2,d3;
//		d1 = new Department(1,"CS");
//		d2 = new Department(2,"IT");
//		d3 = new Department(3,"EC");
//		s.beginTransaction();
//		
//		Set<Employee> d1Employlee = new HashSet<Employee>();
//		Set<Employee> d2Employlee = new HashSet<Employee>();
		  
//		d1Employlee.add(e1);
//		d1Employlee.add(e4);
		  
//		d2Employlee.add(e2);
//		d2Employlee.add(e3);
//		d2Employlee.add(e5);
		  
//		d1.setEmployees(d1Employlee);
//		d2.setEmployees(d2Employlee);
//		s.save(d1);	
//		s.save(d2);
//		s.save(d3);
		
		
		//s.createQuery("delete from Department where id = '3'").executeUpdate();
		s.getTransaction().commit();}
		catch (Exception e) {System.out.println(e);}
	}

}
