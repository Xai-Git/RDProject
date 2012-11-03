package rdproject.service;

import rdproject.model.RdAddDrugPage;

/**
 * 
 * @author Samuel Aquino
 * Service functions for RdDashboard
 */
public interface RdDashboardService 
{
	public void deleteDrug();
	public void addDrug();
	public RdAddDrugPage searchDrug(String Drug);
	public Double calcDrugDose();
}
