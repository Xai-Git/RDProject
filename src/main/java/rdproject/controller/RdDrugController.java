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

import rdproject.model.Drug;
import rdproject.service.RdDrugService;
import rdproject.validator.RdDrugValidator;

@Controller
@RequestMapping("/drug")
@SessionAttributes("drug")
public class RdDrugController 
{
	@Autowired
	private RdDrugService drugService;
	
	@RequestMapping(method = RequestMethod.POST)
	public String submit(@ModelAttribute("drugForm") Drug drug, BindingResult result, HttpServletRequest request)
	{
		new RdDrugValidator().validate(drug,result);
		if (result.hasErrors())
		{
			return "drug/add/{id}";
		}
		else
		{
			return"redirect:/dashboard";
		}
	}
	
	@RequestMapping(value="/edit/{drugId}", method = RequestMethod.GET)
	public String edit(@PathVariable("drugId") Long id, ModelMap map, HttpServletRequest request)
	{
		Drug drug = drugService.getDrug(id);
		map.addAttribute("drug", drug);
		return "drug";
	}
	
	@RequestMapping(value="/add", method = RequestMethod.GET)
	public String add(@ModelAttribute("drugForm") Drug drug, BindingResult result, HttpServletRequest request)
	{
		return "drug";
	}
}
