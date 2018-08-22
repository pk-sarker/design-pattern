package com.dp.behavioral.state;

public class StateMain {

	public static void main(String[] args) {
		final StateContext stateContext = new StateContext(new IssueRaised());
		
		stateContext.startProcessing();
		stateContext.complete();
		System.out.println("--- --- --- --- --- --- --- --- --- --- --- ");
		stateContext.startProcessing();
		stateContext.complete();
		System.out.println("--- --- --- --- --- --- --- --- --- --- --- ");
		stateContext.startProcessing();
		stateContext.complete();
		System.out.println("--- --- --- --- --- --- --- --- --- --- --- ");
		stateContext.startProcessing();
		stateContext.complete();
		System.out.println("--- --- --- --- --- --- --- --- --- --- --- ");
		stateContext.startProcessing();
		stateContext.complete();
		System.out.println("--- --- --- --- --- --- --- --- --- --- --- ");
		stateContext.startProcessing();
		stateContext.complete();
		
	}

}
