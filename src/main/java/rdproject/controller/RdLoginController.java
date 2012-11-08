package rdproject.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.util.WebUtils;
import org.springframework.beans.factory.annotation.Autowired;

import rdproject.form.RdLoginForm;
import rdproject.model.User;
import rdproject.service.RdAccountService;
import rdproject.validator.RdLoginValidator;

@Controller
@RequestMapping("/login")
public class RdLoginController 
{
	@Autowired
	private RdAccountService securityService;
	
	@RequestMapping(method = RequestMethod.POST)
	public String processSubmit(@ModelAttribute("loginForm") RdLoginForm form, BindingResult result,
			HttpServletRequest request)
	{
		new RdLoginValidator().validate(form, result);
		if(result.hasErrors())
		{
			return "login";
		}
		else
		{
			User user = securityService.authenticate(form.getUsername(), form.getPassword(), result);
			if(result.hasErrors())
			{
				return "login";
			}
			else
			{
				WebUtils.setSessionAttribute(request, "user", user);
				return "dashboard";
			}
		}
	}
	
	/**
	 * Sets up login form and renders view.
	 * @param form
	 * @return
	 */
	@RequestMapping(method = RequestMethod.GET)
	public String setupForm(@ModelAttribute("loginForm") RdLoginForm form)
	{
		return "login";
	}
}
