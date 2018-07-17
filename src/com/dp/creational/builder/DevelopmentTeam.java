package com.dp.creational.builder;

public class DevelopmentTeam {
	private ApplicationBuilder applicationBuilder;
	 
    public DevelopmentTeam(ApplicationBuilder applicationBuilder)
    {
        this.applicationBuilder = applicationBuilder;
    }
 
    public Application getApplication()
    {
        return this.applicationBuilder.getApplication();
    }
 
    public void buildApplication()
    {
        this.applicationBuilder.analyzeApplication();
        this.applicationBuilder.setApplicationType();
        this.applicationBuilder.setAppropriateTechnologies();
        this.applicationBuilder.buildApplicationArchitecture();
        this.applicationBuilder.startBuildingApplication();
        this.applicationBuilder.applicationCompleted();
        //this.applicationBuilder.startBuildingApplication();
       
    }
}
