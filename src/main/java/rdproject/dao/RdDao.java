package rdproject.dao;

import rdproject.model.Drug;

public interface RdDao 
{
	public void saveDrug(Drug aDrug);
	public void deleteDrug(Drug aDrug);
	public Drug searchDrug(Drug aDrug);
	public Double calcDrugDose(Drug aDrug);
}