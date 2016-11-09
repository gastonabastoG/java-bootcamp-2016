package topic3.topic3;


public class User
{
	private String name;
	private String surname;
	private String email;
	private String gender;
	private String password;

	
	public User(String name, String surname, String email, String gender,
			String password) 
	{
		super();
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.gender = gender;
		this.password = password;

	}

	public String getName() 
	{
		return name;
	}

	public String getSurname() 
	{
		return surname;
	}

	public String getEmail() 
	{
		return email;
	}

	public String getGender()
	{
		return gender;
	}

	public String getPassword() 
	{
		return password;
	}


}