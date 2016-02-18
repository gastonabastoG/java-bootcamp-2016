package builder;

public class Book {
	
	private String id;
	private String name;
	private String author;
	
	public String getID(){
		return this.id;
	}
	
	public void setID( String id ){
		this.id = id;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setName( String name ){
		this.name = name;
	}
	
	public void setAuthor( String author ){
		this.author = author;
	}
	
	public String getAuthor(){
		return this.author;
	}

}
