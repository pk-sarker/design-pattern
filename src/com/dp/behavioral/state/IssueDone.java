package com.dp.behavioral.state;

public class IssueDone implements IssueState {
	@Override
	public void startProcessing() {
		System.out.println("StartProcessing: State: IssueDone ");
		System.out.println("Process: Unit testing in local development environment.");
		System.out.println("Process: Check-in the code in source version control.");
		System.out.println("Process: Issue log updated in JIRA");
	}
	
	@Override
	public void complete(StateContext context) {
		System.out.println("Complete : State: IssueDone ");
		context.setIssueState(new IssueTesting());
	}

}
