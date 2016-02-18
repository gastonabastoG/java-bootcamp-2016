package org.Topic5;


import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Field;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Index;
import org.mongodb.morphia.annotations.Indexes;
import org.mongodb.morphia.annotations.Reference;

@Entity("course")
@Indexes(
    @Index(value = "id", fields = @Field("id"))
)

public class Course {

	 	@Id
	    private ObjectId _id;
	 	private int id;
	    private String name;
	    private int hours_by_week;
	    private int assigned_teacher;
	    @Reference
	    private Teacher teacher;
	    
	    public Course(){
	    }
	    
	    public Course( final String name, final int hours_by_week, final int assigned_teacher ){
	    	this.name = name;
	    	this.hours_by_week = hours_by_week;
	    	this.assigned_teacher = assigned_teacher;
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
	    
	    public String getName(){
	    	return name;
	    }
	    
	    public void setName( String name ){
	    	this.name = name;
	    }
	    
	    public int getHours_by_week(){
	    	return hours_by_week;
	    }
	    
	    public void setHours_by_week( int hours_by_week ){
	    	this.hours_by_week = hours_by_week;
	    }
	    
	    public int getAssigned_teacher(){
	    	return assigned_teacher;
	    }
	    
	    public void setAssigned_teacher( int assigned_teacher ){
	    	this.assigned_teacher = assigned_teacher;
	    }
	    
	    public Teacher getTeacher(){
	    	return teacher;
	    }
	    
	    public void setTeacher( Teacher teacher ){
	    	this.teacher = teacher;
	    }
}
