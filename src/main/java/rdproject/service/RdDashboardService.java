package rdproject.service;

import rdproject.model.Drug;

/**
 * 
 * @author Samuel Aquino
 * Service functions for RdDashboard
 */
public interface RdDashboardService 
{
	public void deleteDrug(Drug aDrug);
	public void saveDrug(Drug aDrug);
	public Drug searchDrug(Drug aDrug);
	public Double calcDrugDose(Drug aDrug);
}
