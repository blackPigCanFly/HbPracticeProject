package entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class ReadStudentDemo {
    public static void main(String[] args)
    {
        // create session factory
        SessionFactory factory = new Configuration()
                .configure()
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        //create session
        Session session = factory.getCurrentSession();

        try
        {
            //create target obj
            System.out.println("create target obj");
            Student theStudent = new Student("readme", "readme","readme@readme,com");
            System.out.println("target created obj");

            //start transaction
            System.out.println("Beginning Transaction");
            session.beginTransaction();
            System.out.println("Transaction started");
            //save target obj;
            System.out.println("Saving target obj...");
            session.save(theStudent);

            //commit transaction;
            System.out.println("committing...");
            session.getTransaction().commit();







        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {

        }


    }
}
