package rdproject.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import rdproject.model.Organization;
import rdproject.service.RdOrganizationService;
import rdproject.validator.RdOrganizationValidator;

@Controller
@RequestMapping("/organization")
@SessionAttributes("orgForm")
public class RdOrganizationController {

	@Autowired
	private RdOrganizationService orgService;
	
	@RequestMapping(method = RequestMethod.POST)
	public String submit(@ModelAttribute("orgForm") Organization org, BindingResult result, HttpServletRequest request)
	{
		new RdOrganizationValidator().validate(org,result);
		if (result.hasErrors())
		{
			return "/organization";
		}
		else
		{
			orgService.save(org, request);
			return"redirect:/dashboard";
		}
	}
	
	@RequestMapping(value="/edit/{orgId}", method = RequestMethod.GET)
	public String edit(@PathVariable("orgId") Long id, ModelMap map, HttpServletRequest request)
	{
		Organization org = orgService.getOrg(id,request);
		map.addAttribute("orgForm", org);
		return "organization";
	}
	
	@RequestMapping(value="/add", method = RequestMethod.GET)
	public String add(ModelMap map, HttpServletRequest request)
	{
		Organization org = new Organization();
		map.addAttribute("orgForm", org);
		return "organization";
	}
}
