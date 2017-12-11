package ie.cit.adf.controller;

import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import ie.cit.adf.domain.Login;
import ie.cit.adf.domain.Payment;
import ie.cit.adf.domain.Package;
import ie.cit.adf.domain.User;
import ie.cit.adf.repository.IPackageRepository;
import ie.cit.adf.repository.IPaymentRepository;
import ie.cit.adf.repository.IUserRepository;


@Controller
public class ApplicationController {

	@Autowired
	private EntityManager entityManager;
	
	@Autowired 
	private IUserRepository userRepository;
	@Autowired
	private IPackageRepository packageRepository;
	@Autowired
	private IPaymentRepository paymentRepository;
	
	private User loggedInUser = new User();
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String toLogin(Map<String, Object> model) {
		
		model.put("login", new Login());
		return "/login";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST, params="action=Login")
	public String authenticateLoginDetails(
			@RequestParam(value="action", required=true) String action,
			Login login, Map<String, Object> model) {
		
		String directory = "/login";
		
		String userName = login.getUserName();
		String password = login.getPassword();
		
		User user = userRepository.findByLoginCredentials(userName, password);
		
		if(user != null) {
			directory = "/home";
			model.put("user", user);
			loggedInUser = user;
		}
		else {
			model.put("errorMessage", "The login details you entered are incorrect!");
		}
		
		return directory;
	}
	
	@RequestMapping(value="/home", method=RequestMethod.GET, params="action=My Orders")
	public String toMyOrders(
			@RequestParam(value="action", required=true) String action,
			Map<String, Object> model) {
		
		entityManager.clear();
		loggedInUser = userRepository.findOne(loggedInUser.getId());
		

		
		model.put("packages", paymentRepository.findAll());
		return "/myOrders";
	}
	
	
	@RequestMapping(value="/myOrders", method=RequestMethod.GET, params="action=Remove Order")
	public String removePackage(
			@RequestParam(value="action", required=true) String action,
			@RequestParam("id") int id,
			Map<String, Object> model) {
		paymentRepository.delete(id);
		
		return "/home";
	}
	
	@RequestMapping(value="/myOrders", method=RequestMethod.GET, params="action=Return to Home Page")
	public String returnHomeFromMyPackages(
			@RequestParam(value="action", required=true) String action) {
					
		return "/home";
	}
	
	@RequestMapping(value="/home", method=RequestMethod.GET, params="action=All Packages")
	public String toAllPackages(
			@RequestParam(value="action", required=true) String action, Map<String, Object> model) {
		
		model.put("packages", packageRepository.findAll());
		
		return "/allPackages";
	}
	
	@RequestMapping(value="/allPackages", method=RequestMethod.GET, params="action=Return to Home Page")
	public String returnHomeFromAllPackages(
			@RequestParam(value="action", required=true) String action) {
				
		return "/home";
	}
	
	@RequestMapping(value="/allPackages", method=RequestMethod.GET, params="action=Make Payment")
	public String makePayment(
			@RequestParam(value="action", required=true) String action,
			@RequestParam("id") int packageId,
			Map<String, Object> model) {

		Package package_ = packageRepository.findOne(packageId);
		Payment payment = new Payment();
		
		payment.setUser(loggedInUser);
		payment.setPackage(package_);
		payment.setPaymentAmount(package_.getPackageAmount());
		
		paymentRepository.save(payment);
		packageRepository.save(package_);
		
		entityManager.clear();
		model.put("paymentMessage", "Package has been added to orders and it will cost €" + payment.getPackage().getPackageAmount());
		
		return "/allPackages";
	}
}
