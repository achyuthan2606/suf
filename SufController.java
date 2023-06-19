package net.javaguides.studentuserform.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import net.javaguides.studentuserform.model.User;
import net.javaguides.studentuserform.repo.UserRepositary;



@Controller
public class SufController {
	
	@Autowired
	private UserRepositary userrepo;
	
	@GetMapping("/")
	public String suf() {
	return "suf";
}
	@PostMapping("/register")
    public String userRegistration(@ModelAttribute User user, Model model) {
		System.out.println(user.toString());
		
		System.out.println(user.getFname());
		System.out.println(user.getLname());
		System.out.println(user.getDept());
		System.out.println(user.getEmail());
		System.out.println(user.getCgpa());
		System.out.println(user.getDob());
		System.out.println(user.getGender());
		
		User user_inserted=userrepo.save(user);
		model.addAttribute("message",user_inserted.getEmail()+"inserted.");
		return "welcome";
	}
}