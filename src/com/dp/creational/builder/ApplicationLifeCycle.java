package com.dp.creational.builder;

import java.util.Set;

public interface ApplicationLifeCycle {
	public void analyzeApplication();
	public void setApplicationType(String status);
	public void setAppropriateTechnologies(Set<String> technologies);
	public void buildApplicationArchitecture(String status);
	public void startBuildingApplication(String status);
	public void applicationCompleted(String status);
	public void printReport();
}
