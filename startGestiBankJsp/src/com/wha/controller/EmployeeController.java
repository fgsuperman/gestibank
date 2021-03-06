package com.wha.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.wha.model.Conseiller;
import com.wha.model.Employee;
import com.wha.service.ConseillerService;
import com.wha.service.EmployeeService;


//bonjour on test une pull 
@Controller
public class EmployeeController {
	private static final Logger logger = Logger.getLogger(EmployeeController.class);

	public EmployeeController() {
		System.out.println("**** EmployeeController() ****");
	}

	@Autowired
	private EmployeeService employeeService;
	
	@Autowired
	private ConseillerService conseillerService;

	@RequestMapping(value = "/1")
	public ModelAndView listEmployee(ModelAndView model) throws IOException {
		List<Employee> listEmployee = employeeService.getAllEmployees();
		model.addObject("listEmployee", listEmployee);
		model.setViewName("home");
		return model;
	}

	@RequestMapping(value = "/newEmployee", method = RequestMethod.GET)
	public ModelAndView newContact(ModelAndView model) {
		Employee employee = new Employee();
		model.addObject("employee", employee);
		model.setViewName("EmployeeForm");
		return model;
	}

	@RequestMapping(value = "/saveEmployee", method = RequestMethod.POST)
	public ModelAndView saveEmployee(@ModelAttribute Employee employee) {
		if (employee.getId() == 0) { // if employee id is 0 then creating the
			// employee other updating the employee
			employeeService.addEmployee(employee);
		} else {
			employeeService.updateEmployee(employee);
		}
		return new ModelAndView("redirect:/");
	}

	@RequestMapping(value = "/deleteEmployee", method = RequestMethod.GET)
	public ModelAndView deleteEmployee(HttpServletRequest request) {
		int employeeId = Integer.parseInt(request.getParameter("id"));
		employeeService.deleteEmployee(employeeId);
		return new ModelAndView("redirect:/");
	}

	@RequestMapping(value = "/editEmployee", method = RequestMethod.GET)
	public ModelAndView editContact(HttpServletRequest request) {
		int employeeId = Integer.parseInt(request.getParameter("id"));
		Employee employee = employeeService.getEmployee(employeeId);
		ModelAndView model = new ModelAndView("EmployeeForm");
		model.addObject("employee", employee);

		return model;
	}

	
	/*
	//-- Debut Partie controller pour conseiller ---------------------------------
	
	@RequestMapping(value = "/listConseiller")
	public ModelAndView listConseiller(ModelAndView model) throws IOException {
		List<Conseiller> listConseiller = conseillerService.getAllConseillers();
		model.addObject("listConseiller", listConseiller);
		model.setViewName("listConseiller");
		return model;
	}
	
	@RequestMapping(value = "/newConseiller", method = RequestMethod.GET)
	public ModelAndView newConseiller(ModelAndView model) {
		Conseiller conseiller = new Conseiller();
		model.addObject("conseiller", conseiller);
		model.setViewName("ConseillerForm");
		return model;
	}
	
	@RequestMapping(value = "/saveConseiller", method = RequestMethod.POST)
	public ModelAndView saveConseiller(@ModelAttribute Conseiller conseiller) {
		System.out.println("** EmployeeController: saveConseiller() ");
		System.out.println("--> conseiller.getMatriculeCnsi() = " + conseiller.getMatriculeCnsi());
		if (conseiller.getMatriculeCnsi() == 0) { // if employee id is 0 then creating the
			// employee other updating the employee
			conseillerService.addConseiller(conseiller);
			System.out.println("--> EmployeeController : conseillerService.addConseiller()");
		} else { 
			conseillerService.updateConseiller(conseiller);
			System.out.println("--> EmployeeController : conseillerService.updateConseiller()");
		}
		return new ModelAndView("redirect:/listConseiller");
	}
	
	
	@RequestMapping(value = "/editConseiller", method = RequestMethod.GET)
	public ModelAndView editConseiller(HttpServletRequest request) {
		int conseillerId = Integer.parseInt(request.getParameter("matriculeCnsi"));
		Conseiller conseiller = conseillerService.getConseiller(conseillerId);
		ModelAndView model = new ModelAndView("ConseillerForm");
		model.addObject("conseiller", conseiller);

		return model;
	}
	
	
	@RequestMapping(value = "/deleteConseiller", method = RequestMethod.GET)
	public ModelAndView deleteConseiller(HttpServletRequest request) {
		int conseillerId = Integer.parseInt(request.getParameter("matriculeCnsi"));
		conseillerService.deleteConseiller(conseillerId);
		return new ModelAndView("redirect:/listConseiller");
	}

	
	//-- Fin Partie controller pour conseiller ---------------------------------
*/
}
