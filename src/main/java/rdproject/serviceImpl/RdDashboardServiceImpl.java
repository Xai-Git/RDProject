package rdproject.serviceImpl;

import rdproject.service.RdDashboardService;
import rdproject.dao.*;

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
	public void deleteDrug() 
	{
		aDao.deleteDrug();
	    
	}
    
	/**
	 * Adds a drug to the database by calling RdDao's addDrug functon.
	 */
	public void addDrug()
	{
		aDao.addDrug();
	}

	/**
	 * Calculates correct Dosage for administered drug
	 */
	public Double calcDrugDose() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
