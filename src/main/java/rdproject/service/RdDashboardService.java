package rdproject.service;

import rdproject.model.Drug;

/**
 * 
 * @author Samuel Aquino
 * Service functions for RdDashboard
 */
public interface RdDashboardService 
{
	public void deleteDrug();
	public void addDrug();
	public Drug searchDrug(String Drug);
	public Double calcDrugDose();
}
