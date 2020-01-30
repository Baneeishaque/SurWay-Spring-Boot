package com.bedrock2.surway.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String loadHome() {
		return "/views/home.jsp";
	}

	// move following mappings to respective controllers

	@GetMapping("/response")
	public String loadSurvey(Model m) {

		// fake data for temporary use replace with actual data from database
		String[] options = new String[] { "this is option 1", "this is option 2", "this is option 3",
				"this is option 4", "this is option 5", };
		m.addAttribute("type", "attributeValue");
		m.addAttribute("question", "this is the question that is to be displayed");
		// --------------------------------------

		m.addAttribute("options", options);
		return "/views/response.jsp";
	}

	// @GetMapping("/statistics")
	// public String loadStatistics(Model m) {

	// //fake data for temporary use
	// Survey survey = new Survey(
	// "Employee feedback survey",
	// "a survey to collect employee feedback",
	// 20);

	// //------------fake data
	// Map<Integer,Integer> ageWiseCount= new HashMap<Integer,Integer>();
	// ageWiseCount.put(20, 15);
	// ageWiseCount.put(30, 12);
	// ageWiseCount.put(40, 30);
	// ageWiseCount.put(50, 10);

	// SurveyStat surveyStat= new SurveyStat(
	// 123,
	// 200,
	// 120,
	// 60,
	// 20,
	// ageWiseCount
	// );
	// m.addAttribute("survey", survey);
	// m.addAttribute("stats", surveyStat);
	// return "/views/statistics.jsp";
	// }

//	-----------------------------------------------------------

}
