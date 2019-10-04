package core.empmanager.spring;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@RequestMapping("/employee-module/employeeform")
@SessionAttributes("Employee")
public class EmployeeController {
	 @Autowired
	    EmployeeManager manager;
	     
	    @RequestMapping(method = RequestMethod.GET)
	    public String setupForm(Model model)
	    {
	         Employee employee = new Employee();
	         model.addAttribute("employee", employee);
	         return "addEmployee";
	    }
	     
	    @RequestMapping(method = RequestMethod.POST)
	    public String submitForm(@ModelAttribute("employee") Employee employee, BindingResult result, SessionStatus status)
	    {
	        //Store the employee information in database
	        //manager.createNewRecord(employee);
	         
	        //Mark Session Complete
	        status.setComplete();
	        return "redirect:addNew/success";
	    }
	     
	    @RequestMapping(value = "/success", method = RequestMethod.GET)
	    public String success(Model model)
	    {
	         return "addSuccess";
	    }

}
