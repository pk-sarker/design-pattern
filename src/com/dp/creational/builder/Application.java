package com.dp.creational.builder;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.HashSet;
import java.util.Iterator;

public class Application implements ApplicationLifeCycle {
	private String completedAnalysisPhase;
	private String completedDesignPhase;
	private String completedImplementationPhase;
	private String completedTestingPhase;
	private String completedDeploymentPhase;
	
	private String applicationType;
	private Set<String> technologies = new HashSet<String>();
	private String applicationArchitecture;
	
	public void setAnalysisPhaseStatus(String status) {
		this.completedAnalysisPhase = status;
	}
	
	public String getAnalysisPhaseStatus() {
		return this.completedAnalysisPhase;
	}
	
	public void setDesignPhaseStatus(String status) {
		this.completedDesignPhase = status;
	}
	public String getDesignPhaseStatus() {
		return this.completedDesignPhase;
	}
	
	public void setImplementationPhaseStatus(String status) {
		this.completedImplementationPhase = status;
	}
	
	public String getImplementationPhaseStatus() {
		return this.completedImplementationPhase;
	}
	
	public void setTestingPhaseStatus(String status) {
		this.completedTestingPhase = status;
	}
	public String getTestingPhaseStatus() {
		return this.completedTestingPhase;
	}
	
	public void setDeploymentPhaseStatus(String status) {
		this.completedDeploymentPhase = status;
	}
	public String getDeploymentPhaseStatus() {
		return this.completedDeploymentPhase;
	}
	
	@Override
	public void analyzeApplication() {
		this.setAnalysisPhaseStatus("DONE");
	}
	
	@Override
	public void setApplicationType(String type) {
		this.applicationType = type;
	}
	public String getApplicationType() {
		return this.applicationType;
	}
	
	@Override
	public void setAppropriateTechnologies(Set<String> technologies) {
		this.technologies = technologies.stream().collect(Collectors.toSet());
	}
	public Set<String> getAppropriateTechnologies() {
		return this.technologies;
	}
	
	@Override
	public void buildApplicationArchitecture(String architecture) {
		this.applicationArchitecture = architecture;
		this.setDesignPhaseStatus("DONE");
	}
	public String getApplicationArchitecture() {
		return this.applicationArchitecture;
	}
	@Override
	public void startBuildingApplication(String buildStatus) {
		this.setImplementationPhaseStatus(buildStatus);
	}
	@Override
	public void applicationCompleted(String status) {
		this.setTestingPhaseStatus(status);
		this.setDeploymentPhaseStatus(status);	
	}
	
	@Override
	public void printReport() {
		System.out.println(" ----- APPLICATION DEVELOPMENT INFORMATION ---- ");
		System.out.println(" Analysis Phase: " + this.getAnalysisPhaseStatus() );
		System.out.println(" Design Phase: " + this.getDesignPhaseStatus());
		System.out.println(" Implementation Phase: " + this.getImplementationPhaseStatus());
		System.out.println(" Testing Phase: " + this.getTestingPhaseStatus());
		System.out.println(" Deployment Phase: " + this.getDeploymentPhaseStatus());
		System.out.println(" Application Type: " + this.getApplicationType());
		System.out.println(" Application Architecture: " + this.getApplicationArchitecture());
		
		String technologiesStr = "[ ";
		Set<String> addedTechnologies = this.getAppropriateTechnologies();
		Iterator iterator = addedTechnologies.iterator();
		while(iterator.hasNext()){
			technologiesStr += (String) iterator.next() + ", ";
		}
		technologiesStr += " ]";
		
		System.out.println(" Used technologies: " + technologiesStr);
	}
	
	
}
