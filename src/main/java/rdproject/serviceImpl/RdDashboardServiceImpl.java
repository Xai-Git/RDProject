package rdproject.serviceImpl;

import rdproject.dao.RdDao;
import rdproject.model.Drug;
import rdproject.service.RdDashboardService;

/**
 * 
 * @author Samuel Aquino
 * Dashboard Service functions implemented
 */
public class RdDashboardServiceImpl implements RdDashboardService {

	private RdDao aDao;
	
	/**
	 * Deletes a drug from the database by calling RdDao's deleteDrug function.
	 */
	@Override
	public void deleteDrug() 
	{
		aDao.deleteDrug("");
	    
	}
    
	/**
	 * Adds a drug to the database by calling RdDao's addDrug functon.
	 */
	@Override
	public void addDrug()
	{
		aDao.addDrug();
	}

	/**
	 * Calculates correct Dosage for administered drug
	 */
	@Override
	public Double calcDrugDose() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Drug searchDrug(String Drug)
	{
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
