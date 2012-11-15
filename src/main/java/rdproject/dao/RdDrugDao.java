package rdproject.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import rdproject.model.Drug;
import rdproject.model.User;

public interface RdDrugDao 
{
	public void saveDrug(Drug aDrug) throws DataAccessException;
	public void deleteDrug(Drug aDrug) throws DataAccessException;
	public Drug searchDrug(Drug aDrug);
	public Double calcDrugDose(Drug aDrug);
	public List<Drug> retrieveDrugList(Long id)throws DataAccessException;
	public Drug getDrug(Long id) throws DataAccessException;
}