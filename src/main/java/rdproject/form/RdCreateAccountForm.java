package rdproject.form;

public class RdCreateAccountForm 
{
	/**
	 * Constructors
	 */
	public RdCreateAccountForm(){}
	
	public RdCreateAccountForm(String username, String password,
			String rePassword, String role) 
	{
		super();
		this.username = username;
		this.password = password;
		this.rePassword = rePassword;
		this.role = role;
	}
	
	/**
	 * Getters and setters.
	 * @return
	 */
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRePassword() {
		return rePassword;
	}

	public void setRePassword(String rePassword) {
		this.rePassword = rePassword;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	/**
	 * Convery to string
	 */
	@Override
	public String toString() {
		return "RdCreateAccountForm [username=" + username + ", password="
				+ password + ", rePassword=" + rePassword + ", role=" + role
				+ "]";
	}

	/**
	 * Private memeber data
	 */
	private String username;
	private String password;
	private String rePassword;
	private String role;
	
}
