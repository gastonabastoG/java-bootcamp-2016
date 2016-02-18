package org.Topic5;


import java.net.UnknownHostException;
import java.util.Iterator;
import java.util.List;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;
import org.mongodb.morphia.query.Query;
import com.mongodb.MongoClient;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws UnknownHostException
    {
    	final Morphia morphia = new Morphia();

        // tell morphia where to find your classes
        // can be called multiple times with different packages or classes
    	
        morphia.mapPackage("org.Topic5");
        
        // create the Datastore connecting to the database running on the default port on the local host
        Datastore datastore = morphia.createDatastore( new MongoClient("DESKTOP-G1MCAAE", 27000), "local");
        //datastore.getDB().dropDatabase();
        datastore.ensureIndexes();

       // final Teacher alber = new Teacher("Alberto", "Ghibaudo", new Date(19900508));
       // datastore.save(alber);

       // datastore.save(alber);

        Query<Student_course> query = datastore.createQuery(Student_course.class);
        List<Student_course> student_course = query.asList();
        
      //  Query<Course> queryCourse = datastore.createQuery(Course.class);
      //  List<Course> course = queryCourse.asList();
        
      //  Query<Teacher> queryTeacher = datastore.createQuery(Teacher.class);
      //  List<Teacher> teacher = queryTeacher.asList();
        
      //  Query<Student_notes> queryStudent_notes = datastore.createQuery(Student_notes.class);
      //  List<Student_notes> student_notes = queryStudent_notes.asList();
        
        for (int i = 0; i < student_course.size(); i++) {
			
        	Student_course aux = student_course.get(i);
        	
        	aux.getId_student();
		}
        
        System.out.println(student_course.size());


    }
}
