package rdproject.form;

/**
 * 
 * @author Samuel Aquino
 *
 */
public class RdLoginForm 
{
	/**
	 * Default Constructor
	 */
	public RdLoginForm() {}
	
	/**
	 * 
	 * @param user
	 * @param pw
	 * 
	 * Constructor
	 */
	public RdLoginForm(Long user, Long pw) {
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
		return "RdLoginForm [user=" + user + ", pw=" + pw + "]";
	}



	/**
	 * private member data
	 */
	private Long user;
	private Long pw;
}
