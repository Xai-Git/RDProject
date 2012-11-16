package rdproject.serviceImpl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.util.WebUtils;

import rdproject.dao.RdDrugDao;
import rdproject.model.Drug;
import rdproject.model.User;
import rdproject.service.RdDrugService;

/**
 * 
 * @author Samuel Aquino
 * Drug Service functions implemented
 */
@Service
public class RdDrugServiceImpl implements RdDrugService {

	@Autowired
	private RdDrugDao aDao;
	
	/**
	 * Deletes a drug from the database by calling RdDrugDao's deleteDrug function.
	 */
	public void deleteDrug(Long id) 
	{
		Drug aDrug = getDrug(id);
		aDao.deleteDrug(aDrug);
	}
    
	/**
	 * Adds a drug to the database by calling RdDrugDao's addDrug functon.
	 */
	@Transactional
	public void saveDrug(Drug aDrug, HttpServletRequest request)
	{
		User user = (User) WebUtils.getSessionAttribute(request, "user");
		aDrug.setUser(user);
		aDao.saveDrug(aDrug);
	}

	/**
	 * Calculates correct Dosage for administered drug
	 */
	public Double calcDrugDose(Drug	aDrug) 
	{
		return aDao.calcDrugDose(aDrug);
	}

	public Drug searchDrug(Drug aDrug)
	{
		return aDao.searchDrug(aDrug);
	}

	public List<Drug> retrieveDrugList(HttpServletRequest request) 
	{
		User user = (User) WebUtils.getSessionAttribute(request, "user");
		List<Drug> list = aDao.retrieveDrugList(user.getId());
		WebUtils.setSessionAttribute(request, "drugList", list);
		return list;
	}
	
	public Drug getDrug(Long id) 
	{
		return aDao.getDrug(id);
	}

}
