package rdproject.dao;

import rdproject.model.Drug;
import rdproject.model.User;

public interface RdDrugDao 
{
	public void saveDrug(Drug aDrug);
	public void deleteDrug(Drug aDrug);
	public Drug searchDrug(Drug aDrug);
	public Double calcDrugDose(Drug aDrug);
	public Drug retrieveDrugList(User aUser);
}