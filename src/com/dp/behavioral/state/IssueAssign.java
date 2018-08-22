package com.dp.behavioral.state;

public class IssueAssign implements IssueState {
	
	@Override
	public void startProcessing() {
		System.out.println("StartProcessing: State: IssueAssign ");
		System.out.println("Process: Assigned the issue to a worker.");
		System.out.println("Process: Set milestone for the issue");
		System.out.println("Process: Issue log updated in JIRA");
	}
	
	@Override
	public void complete(StateContext context) {
		System.out.println("Complete : State: IssueAssign ");
		context.setIssueState(new IssueInProgress());
	}
}
