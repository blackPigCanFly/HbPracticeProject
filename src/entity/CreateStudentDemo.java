package entity;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateStudentDemo {

    //create a session factory
    public static void main(String[] args)
    {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        // create a session
        Session session = factory.getCurrentSession();

        try
        {
            //Create student job
            System.out.println("Creating a student obj");
            Student theStudent = new Student("ZZZ", "XXX","ZZZ@ZZZ.COM");

            //create a session
            Session session1 = factory.getCurrentSession();

            //save target obj
            System.out.println("Saving student obj");
            session.save(theStudent);

            //commit transaction
            System.out.println("committing a transaction");
            session.getTransaction().commit();
            System.out.println("committed");
            System.out.println("================");
            System.out.println("!! DONE !!");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            //close the factory
            factory.close();
        }


    }






}
