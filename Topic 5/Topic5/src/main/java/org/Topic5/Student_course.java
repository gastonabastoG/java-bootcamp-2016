package org.Topic5;


import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Field;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Index;
import org.mongodb.morphia.annotations.Indexes;

@Entity("student_course")
@Indexes(
    @Index(value = "id", fields = @Field("id"))
)

public class Student_course {

	 	@Id
	    private ObjectId _id;
	 	private int id;
	    private int id_student;
	    private int id_course;
	    private int student_notes;
	    
	        
	    public Student_course(){
	    }
	    
	    public Student_course( final int id_student, final int id_course, final int student_notes, final int final_note ){
	    	this.id_student = id_student;
	    	this.id_course = id_course;
	    	this.student_notes = student_notes;
	    }
	    
	    public ObjectId get_Id(){
	    	return _id;
	    }
	    
	    public void set_Id( ObjectId _id ){
	    	this._id = _id;
	    }
	    	    
	    public int getId(){
	    	return id;
	    }
	    
	    public void setId( int id ){
	    	this.id = id;
	    }
	    
	    public int getId_student(){
	    	return id_student;
	    }
	    
	    public void setId_student( int id_student ){
	    	this.id_student = id_student;
	    }
	    
	    public int getId_course(){
	    	return id_course;
	    }
	    
	    public void setId_course( int id_course ){
	    	this.id_course = id_course;
	    }
	    
	    public int getStudent_notes(){
	    	return student_notes;
	    }
	    
	    public void setStudent_notes( int student_notes ){
	    	this.student_notes = student_notes;
	    }
	    
}
