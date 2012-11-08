package rdproject.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import rdproject.form.RdCreateAccountForm;
import rdproject.service.RdAccountService;
import rdproject.validator.RdAccountValidator;

@Controller
@RequestMapping("/createaccount")
public class RdCreateAccountController
{
	@Autowired
	private RdAccountService accountService;

	/**
	 * Return confirmation page on success of account creation
	 * 
	 * @param form
	 * @param result
	 * @param request
	 * @return
	 */
	@RequestMapping(method = RequestMethod.POST)
	public String submit(@ModelAttribute("createAcctForm") RdCreateAccountForm form, BindingResult result, HttpServletRequest request)
	{
		new RdAccountValidator().validate(form, result);
		if (result.hasErrors())
		{
			return "createaccount";
		}
		else
		{
			accountService.createUserAcct(form, result);
			if(result.hasErrors())
			{
				return "createaccount";
			}
			else
			{
			    return "redirect:/confirmAccount";
			}
		}
	}

	/**
	 * Return view of createAccount page
	 * 
	 * @param form
	 * @return
	 */
	@RequestMapping(method = RequestMethod.GET)
	public String setupForm(@ModelAttribute("createAcctForm") RdCreateAccountForm form)
	{
		return "createaccount";
	}
}
