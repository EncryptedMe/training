package MappingRelation2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class Testing {

	public static void main(String[] args) {
		
		Session s =new Configuration().configure().buildSessionFactory().openSession();
		s.beginTransaction();
		
		Employee E[] = new Employee[5];
		
		Department d3 = new Department(4, "EC");
		Department d4 = new Department(3, "ME");
		E[0]=new Employee(107,"Prawjjal Khanna");
		E[1]=new Employee(108,"Prawjjal tank");
		E[2]=new Employee(110,"Prawjjal chobey");
		E[3]=new Employee(111,"Prawjjal lawda");
		E[4]=new Employee(112,"Prawjjal Gupta");
		
		List<Department> ds = new ArrayList<>(); 
		Set<Employee> d3employees = new HashSet<Employee>();
		Set<Employee> d4employees = new HashSet<Employee>();
		d3employees.add(E[0]);
		d3employees.add(E[1]);
		d3employees.add(E[2]);
		d4employees.add(E[3]);
		d4employees.add(E[4]);
		
		ds.add(d3);
		ds.add(d4);
		
		d3.setEmployees(d3employees);
		d4.setEmployees(d4employees);
		
		ds.forEach(d->s.save(d));
		s.getTransaction().commit();

	}

}
