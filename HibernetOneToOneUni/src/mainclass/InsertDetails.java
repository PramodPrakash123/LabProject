package mainclass;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Teacher;
import com.entity.TeacherDetails;

public class InsertDetails {

	public static void main(String[] args) {
		System.out.println("connecting to database");
		
	SessionFactory factory=null;
	factory=new Configuration().configure("hibernate.cfg.xml").
			addAnnotatedClass(Teacher.class).addAnnotatedClass(TeacherDetails.class).
			buildSessionFactory();
	System.out.println("created");
	Session session=factory.getCurrentSession();
	try {
		Teacher t1 = new Teacher("pammu", "k", "pammu@gmail.com");
		TeacherDetails td=new TeacherDetails("kerala","dancing",16000);
		t1.setTeacher_details(td);
		Transaction tx=session.beginTransaction();
		session.save(t1);
		//session.save(td);
		session.getTransaction().commit();
	} catch (Exception e) {
		e.printStackTrace();
		
	}
	finally {
		session.close();
	}
	

	}

}
