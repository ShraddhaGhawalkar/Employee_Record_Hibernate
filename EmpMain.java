package hibernatepack;
import org.hibernate.*;
import org.hibernate.cfg.*;

public class EmpMain {

	public static void main(String[] args) {
		Configuration c = new Configuration();
		c.configure("hibernate.cfg.xml");
		
		SessionFactory factory = c.buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		
		Employee e1 = new Employee();
		e1.setName("Raman");
		
		Regular_employee e2 = new Regular_employee();
		e2.setName("Akshay");
		e2.setSalary(40000);
		e2.setBonus(3000);
		
		Contract_employee e3 = new Contract_employee();
		e3.setName("Raj");
		e3.setContract_duration(2);
		e3.setPay_per_hour(800);
		
		session.persist(e1);
		session.persist(e2);
		session.persist(e3);

		t.commit();
		
		session.close();
		System.out.println("Success...");
	}

}
