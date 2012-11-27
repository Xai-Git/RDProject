package rdproject.serviceImpl;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.util.WebUtils;

import rdproject.dao.RdOrganizationDao;
import rdproject.model.Organization;
import rdproject.model.User;
import rdproject.service.RdOrganizationService;

@Service
public class RdOrganizationServiceImpl implements RdOrganizationService {

	@Autowired
	private RdOrganizationDao orgDao;
	
	@Transactional
	public void save(Organization anOrg, HttpServletRequest request) {
		User user = (User) WebUtils.getSessionAttribute(request, "user");
		anOrg.setUser(user);
		orgDao.save(anOrg);
	}

	public Organization getOrg(Long id, HttpServletRequest request) 
	{
		User user = (User) WebUtils.getSessionAttribute(request, "user");
		return orgDao.getOrg(user.getId());
	}
}
