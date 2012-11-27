package rdproject.service;

import javax.servlet.http.HttpServletRequest;

import rdproject.model.Organization;

public interface RdOrganizationService {
	public void save(Organization anOrg, HttpServletRequest request);
	public Organization getOrg(Long id, HttpServletRequest request);
}
