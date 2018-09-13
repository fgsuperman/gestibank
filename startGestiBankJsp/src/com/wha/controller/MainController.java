package com.wha.controller;

import java.io.IOException;
import java.util.List;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.wha.model.Conseiller;
import com.wha.service.ConseillerService;

@Controller
public class MainController {
	
	
	private static final Logger logger = Logger.getLogger(ConseillerController.class);

	public MainController() {
		System.out.println(" **** MainController() ****");
	}

		
	@RequestMapping(value = "/")
	public ModelAndView mainViewModel(ModelAndView model) throws IOException {

		model.setViewName("mainController");
		return model;
	}

}
