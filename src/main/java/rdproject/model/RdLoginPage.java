package rdproject.model;

/**
 * 
 * @author Samuel Aquino
 * Model in the database for logging in as a user with a password.
 */
public class RdLoginPage 
{
	/**
	 * Default Constructor
	 */
	public RdLoginPage() {}
	
	/**
	 * 
	 * @param user
	 * @param pw
	 * 
	 * Constructor
	 */
	public RdLoginPage(Long user, Long pw) {
		super();
		this.user = user;
		this.pw = pw;
	}
	
	/**
	 * Getters and setters
	 */
	public Long getUser() {
		return user;
	}

	public void setUser(Long user) {
		this.user = user;
	}

	public Long getPw() {
		return pw;
	}

	public void setPw(Long pw) {
		this.pw = pw;
	}

	/**
	 * generate user to string and pw to string
	 */
	@Override
	public String toString() {
		return "RdLoginPage [user=" + user + ", pw=" + pw + "]";
	}

	/**
	 * private member data
	 */
	private Long user;
	private Long pw;
}
