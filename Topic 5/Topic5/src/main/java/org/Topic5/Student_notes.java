package org.Topic5;


import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Field;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Index;
import org.mongodb.morphia.annotations.Indexes;

@Entity("student_notes")
@Indexes(
    @Index(value = "id", fields = @Field("id"))
)

public class Student_notes {

	 	@Id
	    private ObjectId _id;
	 	private int id;
	    private int partial_note_1;
	    private int partial_note_2;
	    private int partial_note_3;
	    private int final_note;
	    
	        
	    public Student_notes(){
	    }
	    
	    public Student_notes( final int partial_note_1, final int partial_note_2, final int partial_note_3, final int final_note ){
	    	this.partial_note_1 = partial_note_1;
	    	this.partial_note_2 = partial_note_2;
	    	this.partial_note_3 = partial_note_3;
	    	this.final_note = final_note;
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
	    
	    public int getPartial_note_1(){
	    	return partial_note_1;
	    }
	    
	    public void setPartial_note_1( int partial_note_1 ){
	    	this.partial_note_1 = partial_note_1;
	    }
	    
	    public int getPartial_note_2(){
	    	return partial_note_2;
	    }
	    
	    public void setPartial_note_2( int partial_note_2 ){
	    	this.partial_note_2 = partial_note_2;
	    }
	    
	    public int getPartial_note_3(){
	    	return partial_note_3;
	    }
	    
	    public void setPartial_note_3( int partial_note_3 ){
	    	this.partial_note_3 = partial_note_3;
	    }
	    
	    public int getFinal_note(){
	    	return final_note;
	    }
	    
	    public void setFinal_note( int final_note ){
	    	this.final_note = final_note;
	    }
}
