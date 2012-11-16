package rdproject.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import rdproject.model.Drug;
import rdproject.service.RdDrugService;

@Controller
public class RdDashboardMultiActionController 
{
	@Autowired RdDrugService drugService;
	/**
	 * Handles request to the dashboard
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/dashboard")
	public String handleHomeRequest(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		drugService.retrieveDrugList(request);
		return "dashboard";
	}
	
	/**
	 * Handles request for account confirmation request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/confirmaccount")
	public String handleCreateAccountSuccess() throws Exception
	{
		return "confirmaccount";
	}
	
	/**
	 * Handles request for organization information
	 * @return
	 * @throws Exception
	 */
	@RequestMapping ("/editOrganization")
	public String handleEditOrganizationInfo() throws Exception
	{
		return "editOrganization";
	}
	
	/**
	 * Handles request to add drug
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/add")
	public String handleAddDrug() throws Exception
	{
		return "drug";
	}
	
	@RequestMapping(value="/delete/{drugId}", method = RequestMethod.GET)	
	public String handleDeleteDrug(@PathVariable("drugId") Long id, ModelMap map, HttpServletRequest request)
	{
		Drug drug = drugService.getDrug(id);
		map.addAttribute("drug", drug);
		drugService.deleteDrug(id);
		return "redirect:/dashboard";
	}

}
