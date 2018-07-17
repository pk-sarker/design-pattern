package com.dp.creational.builder;

import java.util.HashSet;
import java.util.Set;

public class WebAppplicationBuilder implements ApplicationBuilder {
	private Application application;
	
	WebAppplicationBuilder() {
		this.application = new Application();
	}
	
	@Override
	public void analyzeApplication() {
		this.application.analyzeApplication();
	}

	@Override
	public void setApplicationType() {
		this.application.setApplicationType("Personal Web Site");
	}

	@Override
	public void setAppropriateTechnologies() {
		Set<String> technologies = new HashSet<String>();
		technologies.add("HTML");
		technologies.add("JavaScript");
		technologies.add("SCSS");
		technologies.add("Webpack");
		technologies.add("Bootstrap");
		this.application.setAppropriateTechnologies(technologies);
	}

	@Override
	public void buildApplicationArchitecture() {
		this.application.buildApplicationArchitecture("Created architecture for static website.");
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
