package com.adactin.stepdefinition;


import java.io.IOException;

import com.adactin.baseclass.BaseClass;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseClass{
	
	
	@Before
	public void beforeHooks(Scenario scenario) {
	String name = scenario.getName();
	System.out.println("ScenarioName:    "+name);
}
	
	@After
	public void afterHooks(Scenario scenario) throws IOException {
		String status = scenario.getStatus();
		System.out.println("        Scenario  Status:  "+status);
		if (scenario.isFailed()) {
			
			getScreenshot(scenario.getName());
			
		}
		
		

	}

}
