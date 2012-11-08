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
	
	@RequestMapping("confirmAccount")
	public String handleCreateAccountSuccess() throws Exception
	{
		return "confirmAccount";
	}

}
