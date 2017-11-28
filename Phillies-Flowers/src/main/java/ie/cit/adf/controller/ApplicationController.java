package ie.cit.adf.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import ie.cit.adf.domain.Login;
import ie.cit.adf.domain.User;
import ie.cit.adf.repository.IUserRepository;

@Controller
public class ApplicationController {
	
	@Autowired 
	private IUserRepository userRepository;
	
	private User activeUser = new User();
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String toLogin(Map<String, Object> model) {
		
		model.put("loginDetails", new Login());
		return "/login";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST, params="action=Login")
	public String authenticateLoginDetails(
			@RequestParam(value="action", required=true) String action,
			Login login, Map<String, Object> model) {
		
		String directory = "/login";
		
		String username = login.getUserName();
		String password = login.getPassword();
		
		User user = userRepository.findByLoginCredentials(username, password);
		
		if(user != null) {
			directory = "/home";
			model.put("user", user);
			activeUser = user;
		}
		else {
			model.put("errorMessage", "The login details you entered are incorrect!");
		}
		
		return directory;
	}

}
