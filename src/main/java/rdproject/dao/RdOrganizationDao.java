package rdproject.dao;

import rdproject.model.Organization;

public interface RdOrganizationDao {
	
	public void save(Organization anOrg);
	public Organization getOrg(Long id);

}
