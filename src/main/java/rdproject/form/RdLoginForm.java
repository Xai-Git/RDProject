package rdproject.form;

/**
 * 
 * @author Samuel Aquino
 *
 */
public class RdLoginForm 
{
	private String username;
	private String password;
	public RdLoginForm()
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
		return "RdLoginForm [username=" + username + ", password=" + password + "]";
	}
}
