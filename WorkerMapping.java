package hibernate.annotations;

import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class WorkerMapping {
	public static void main(String a[]){
		SessionFactory sessionFactory = new Configuration().configure("hibernate-annotations.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		PermanentWorker permWorker = new PermanentWorker();
		permWorker.setWorkerName("Bhuvaneswaran Ethirajan");
		permWorker.setWorkerPhone("609937939");
		permWorker.setWorkerGender("M");
		permWorker.setDOB(new Date());
		permWorker.setBonus(500);
		permWorker.setSalary(9000);
        session.save(permWorker);        
		session.getTransaction().commit();
	}

}
