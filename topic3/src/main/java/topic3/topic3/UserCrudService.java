package topic3.topic3;

import java.util.List;


public class UserCrudService implements UserService
{
	private DBUsers DBusers;
	
	public UserCrudService()
	{
		this.DBusers = new DBUsers();
	}
	
	public void createUser(User user) 
	{
		try
		{
			if (!DBusers.containsUser(user))
			{
				DBusers.addUser(user);
			}
		} 
		catch(Exception e)
		{
			System.out.println("User already exists.");
		}
	}

	public void deleteUser(User user) 
	{
		try
		{
			if (DBusers.containsUser(user))
			{
				DBusers.removeUser(user);
			}
		} 
		catch(Exception e)
		{
			System.out.println("User not exists");
		}
	}

	public List<User> getUsers() 
	{
		return DBusers.getUsers();
	}

	public void updateUser(User Old, User New) 
	{
		if (DBusers.containsUser(Old)){
			DBusers.removeUser(Old);
			DBusers.addUser(New);
			
		}
	}

}
