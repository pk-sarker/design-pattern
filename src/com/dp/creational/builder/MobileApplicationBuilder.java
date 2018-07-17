package com.dp.creational.builder;

import java.util.HashSet;
import java.util.Set;

public class MobileApplicationBuilder implements ApplicationBuilder {

	private Application application;
	
	MobileApplicationBuilder() {
		this.application = new Application();
	}
	
	@Override
	public void analyzeApplication() {
		this.application.analyzeApplication();
	}

	@Override
	public void setApplicationType() {
		this.application.setApplicationType("Android Mobile Application");
	}

	@Override
	public void setAppropriateTechnologies() {
		Set<String> technologies = new HashSet<String>();
		technologies.add("Xamarin");
		technologies.add("JavaScript");
		technologies.add("CSS");
		technologies.add("HTML");
		this.application.setAppropriateTechnologies(technologies);
	}

	@Override
	public void buildApplicationArchitecture() {
		this.application.buildApplicationArchitecture("Created architecture for android application.");
	}

	@Override
	public void startBuildingApplication() {
		this.application.startBuildingApplication("DONE");
	}

	@Override
	public void applicationCompleted() {
		this.application.applicationCompleted("DONE");
	}
	
	@Override
	public Application getApplication() {
		return this.application;
	}

}
