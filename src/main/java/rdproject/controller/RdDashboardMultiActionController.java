package rdproject.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dashboard")
public class RdDashboardMultiActionController 
{
	/**
	 * Handles request to the dashboard
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("dashboard")
	public String handleHomeRequest(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		return "dashboard";
	}
	
	/**
	 * Handles request for account confirmation request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("confirmaccount")
	public String handleCreateAccountSuccess() throws Exception
	{
		return "confirmaccount";
	}
	
	/**
	 * Handles request for organization information
	 * @return
	 * @throws Exception
	 */
	@RequestMapping ("editOrganization")
	public String handleEditOrganizationInfo() throws Exception
	{
		return "editOrganization";
	}
	
	/**
	 * Handles request to add drug
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("drug")
	public String handleAddDrug() throws Exception
	{
		return "drug";
	}

}
