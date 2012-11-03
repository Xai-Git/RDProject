package rdproject.model;

/**
 * 
 * @author Samuel Aquino
 * Model in the database for logging in as a user with a password.
 */
public class RdLoginPage 
{
	private String username;
	private String password;
	
	public RdLoginPage()
	{
	}
	public String getUsername()
	{
		return username;
	}
	public void setUsername(String username)
	{
		this.username = username;
	}
	public String getPassword()
	{
		return password;
	}
	public void setPassword(String password)
	{
		this.password = password;
	}
	@Override
	public String toString()
	{
		return "RdLoginPage [username=" + username + ", password=" + password + "]";
	}
}
