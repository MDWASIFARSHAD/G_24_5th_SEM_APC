package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {

	@RequestMapping("/form")
	public String form()
	{
		System.out.println("Hello I am wasif");
		System.out.println("Chitkara University");
		System.out.println("Rajpura");
		return "form";
	}
	
	@RequestMapping("/contact")
	public void contact(Model m)
	{
		System.out.println("COntact");
		m.addAttribute("name","I am Wasif");
		
	}
	@RequestMapping("/userform")
	public String userForm()
	{
		return "userform";
	}
	
	@RequestMapping("/formdata")
	public void formdata(@RequestParam("username") String name,@RequestParam("email") String email)
	{
		System.out.println(name);
		System.out.println(email);
	}
	
	
}
