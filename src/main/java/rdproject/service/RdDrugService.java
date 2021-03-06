package rdproject.service;

import java.util.List;



import javax.servlet.http.HttpServletRequest;

import rdproject.model.Drug;

/**
 * 
 * @author Samuel Aquino
 * Service functions for RdDashboard
 */
public interface RdDrugService
{
	public void deleteDrug(Long id);
	public void saveDrug(Drug aDrug, HttpServletRequest request);
	public Drug searchDrug(Drug aDrug);
	public Double calcDrugDose(Drug aDrug);
	public List<Drug> retrieveDrugList(HttpServletRequest request);
	public Drug getDrug(Long id);
	public byte[] outputPdf(Long id);
}
