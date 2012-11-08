package rdproject.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rdproject.dao.RdDao;
import rdproject.model.Drug;
import rdproject.service.RdDashboardService;

/**
 * 
 * @author Samuel Aquino
 * Dashboard Service functions implemented
 */
@Service
public class RdDashboardServiceImpl implements RdDashboardService {

	@Autowired
	private RdDao aDao;
	
	/**
	 * Deletes a drug from the database by calling RdDao's deleteDrug function.
	 */
	@Override
	public void deleteDrug(Drug aDrug) 
	{
		aDao.deleteDrug(aDrug);
	}
    
	/**
	 * Adds a drug to the database by calling RdDao's addDrug functon.
	 */
	@Override
	public void saveDrug(Drug aDrug)
	{
		aDao.saveDrug(aDrug);
	}

	/**
	 * Calculates correct Dosage for administered drug
	 */
	@Override
	public Double calcDrugDose(Drug	aDrug) 
	{
		return aDao.calcDrugDose(aDrug);
	}

	@Override
	public Drug searchDrug(Drug aDrug)
	{
		return aDao.searchDrug(aDrug);
	}
	
	

}
