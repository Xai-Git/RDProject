package rdproject.model;

public class Organization 
{
	public Organization () {}
	
	public Organization(String orgName, String orgAddr1, String orgAddr2,
			String orgCity, String orgState, String orgZip, String orgWeb,
			String orgPhone, String orgFax, String orgEmail, String dirTitle,
			String dirFName, String dirMName, String dirLName,
			String dirSuffix, String dirPhone, String dirExt, String dirFax,
			String dirEmail, String conTitle, String conFName, String conMName,
			String conLName, String conSuffix, String conPhone, String conFax,
			String conEmail, String username) {
		super();
		this.orgName = orgName;
		this.orgAddr1 = orgAddr1;
		this.orgAddr2 = orgAddr2;
		this.orgCity = orgCity;
		this.orgState = orgState;
		this.orgZip = orgZip;
		this.orgWeb = orgWeb;
		this.orgPhone = orgPhone;
		this.orgFax = orgFax;
		this.orgEmail = orgEmail;
		this.dirTitle = dirTitle;
		this.dirFName = dirFName;
		this.dirMName = dirMName;
		this.dirLName = dirLName;
		this.dirSuffix = dirSuffix;
		this.dirPhone = dirPhone;
		this.dirExt = dirExt;
		this.dirFax = dirFax;
		this.dirEmail = dirEmail;
		this.conTitle = conTitle;
		this.conFName = conFName;
		this.conMName = conMName;
		this.conLName = conLName;
		this.conSuffix = conSuffix;
		this.conPhone = conPhone;
		this.conFax = conFax;
		this.conEmail = conEmail;
		this.username = username;
	}
	
	/**
	 * Getters and Setters
	 * @return
	 */
	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getOrgAddr1() {
		return orgAddr1;
	}

	public void setOrgAddr1(String orgAddr1) {
		this.orgAddr1 = orgAddr1;
	}

	public String getOrgAddr2() {
		return orgAddr2;
	}

	public void setOrgAddr2(String orgAddr2) {
		this.orgAddr2 = orgAddr2;
	}

	public String getOrgCity() {
		return orgCity;
	}

	public void setOrgCity(String orgCity) {
		this.orgCity = orgCity;
	}

	public String getOrgState() {
		return orgState;
	}

	public void setOrgState(String orgState) {
		this.orgState = orgState;
	}

	public String getOrgZip() {
		return orgZip;
	}

	public void setOrgZip(String orgZip) {
		this.orgZip = orgZip;
	}

	public String getOrgWeb() {
		return orgWeb;
	}

	public void setOrgWeb(String orgWeb) {
		this.orgWeb = orgWeb;
	}

	public String getOrgPhone() {
		return orgPhone;
	}

	public void setOrgPhone(String orgPhone) {
		this.orgPhone = orgPhone;
	}

	public String getOrgFax() {
		return orgFax;
	}

	public void setOrgFax(String orgFax) {
		this.orgFax = orgFax;
	}

	public String getOrgEmail() {
		return orgEmail;
	}

	public void setOrgEmail(String orgEmail) {
		this.orgEmail = orgEmail;
	}

	public String getDirTitle() {
		return dirTitle;
	}

	public void setDirTitle(String dirTitle) {
		this.dirTitle = dirTitle;
	}

	public String getDirFName() {
		return dirFName;
	}

	public void setDirFName(String dirFName) {
		this.dirFName = dirFName;
	}

	public String getDirMName() {
		return dirMName;
	}

	public void setDirMName(String dirMName) {
		this.dirMName = dirMName;
	}

	public String getDirLName() {
		return dirLName;
	}

	public void setDirLName(String dirLName) {
		this.dirLName = dirLName;
	}

	public String getDirSuffix() {
		return dirSuffix;
	}

	public void setDirSuffix(String dirSuffix) {
		this.dirSuffix = dirSuffix;
	}

	public String getDirPhone() {
		return dirPhone;
	}

	public void setDirPhone(String dirPhone) {
		this.dirPhone = dirPhone;
	}

	public String getDirExt() {
		return dirExt;
	}

	public void setDirExt(String dirExt) {
		this.dirExt = dirExt;
	}

	public String getDirFax() {
		return dirFax;
	}

	public void setDirFax(String dirFax) {
		this.dirFax = dirFax;
	}

	public String getDirEmail() {
		return dirEmail;
	}

	public void setDirEmail(String dirEmail) {
		this.dirEmail = dirEmail;
	}

	public String getConTitle() {
		return conTitle;
	}

	public void setConTitle(String conTitle) {
		this.conTitle = conTitle;
	}

	public String getConFName() {
		return conFName;
	}

	public void setConFName(String conFName) {
		this.conFName = conFName;
	}

	public String getConMName() {
		return conMName;
	}

	public void setConMName(String conMName) {
		this.conMName = conMName;
	}

	public String getConLName() {
		return conLName;
	}

	public void setConLName(String conLName) {
		this.conLName = conLName;
	}

	public String getConSuffix() {
		return conSuffix;
	}

	public void setConSuffix(String conSuffix) {
		this.conSuffix = conSuffix;
	}

	public String getConPhone() {
		return conPhone;
	}

	public void setConPhone(String conPhone) {
		this.conPhone = conPhone;
	}

	public String getConFax() {
		return conFax;
	}

	public void setConFax(String conFax) {
		this.conFax = conFax;
	}

	public String getConEmail() {
		return conEmail;
	}

	public void setConEmail(String conEmail) {
		this.conEmail = conEmail;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * Generate to string
	 */
	@Override
	public String toString() {
		return "Organization [orgName=" + orgName + ", orgAddr1=" + orgAddr1
				+ ", orgAddr2=" + orgAddr2 + ", orgCity=" + orgCity
				+ ", orgState=" + orgState + ", orgZip=" + orgZip + ", orgWeb="
				+ orgWeb + ", orgPhone=" + orgPhone + ", orgFax=" + orgFax
				+ ", orgEmail=" + orgEmail + ", dirTitle=" + dirTitle
				+ ", dirFName=" + dirFName + ", dirMName=" + dirMName
				+ ", dirLName=" + dirLName + ", dirSuffix=" + dirSuffix
				+ ", dirPhone=" + dirPhone + ", dirExt=" + dirExt + ", dirFax="
				+ dirFax + ", dirEmail=" + dirEmail + ", conTitle=" + conTitle
				+ ", conFName=" + conFName + ", conMName=" + conMName
				+ ", conLName=" + conLName + ", conSuffix=" + conSuffix
				+ ", conPhone=" + conPhone + ", conFax=" + conFax
				+ ", conEmail=" + conEmail + ", username=" + username + "]";
	}
	
	/**
	 * Private member data
	 */
	private String orgName;
	private String orgAddr1;
	private String orgAddr2;
	private String orgCity;
	private String orgState;
	private String orgZip;
	private String orgWeb;
	private String orgPhone;
	private String orgFax;
	private String orgEmail;
	private String dirTitle;
	private String dirFName;
	private String dirMName;
	private String dirLName;
	private String dirSuffix;
	private String dirPhone;
	private String dirExt;
	private String dirFax;
	private String dirEmail;
	private String conTitle;
	private String conFName;
	private String conMName;
	private String conLName;
	private String conSuffix;
	private String conPhone;
	private String conFax;
	private String conEmail;
	private String username;
}
