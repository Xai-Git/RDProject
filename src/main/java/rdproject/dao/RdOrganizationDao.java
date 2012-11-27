package rdproject.dao;

import org.springframework.dao.DataAccessException;

import rdproject.model.Organization;

public interface RdOrganizationDao {
	
	public void save(Organization anOrg) throws DataAccessException;
	public Organization getOrg(Long id);

}
