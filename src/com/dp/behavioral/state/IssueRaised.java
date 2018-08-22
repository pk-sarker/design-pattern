package com.dp.behavioral.state;

public class IssueRaised implements IssueState {

	@Override
	public void startProcessing() {
		System.out.println("StartProcessing: State: IssueRaised ");
		System.out.println("Process: Set priority of the issue");
		System.out.println("Process: Set project for the issue");
		System.out.println("Process: Issue logged in JIRA");
	}
	
	@Override
	public void complete(StateContext context) {
		System.out.println("Complete : State: IssueRaised ");
		context.setIssueState(new IssueAssign());
	}
}
