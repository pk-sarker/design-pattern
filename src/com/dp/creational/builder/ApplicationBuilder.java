/**
 * 
 */
package com.dp.creational.builder;

/**
 * @author pijus
 *
 */
public interface ApplicationBuilder {
	public void analyzeApplication();
	public void setApplicationType();
	public void setAppropriateTechnologies();
	public void buildApplicationArchitecture();
	public void startBuildingApplication();
	public void applicationCompleted();
	public Application getApplication();
	
	//BuilderPatternMain
}
