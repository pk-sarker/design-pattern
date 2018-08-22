package com.dp.behavioral.state;

public class IssueInProgress implements IssueState {
	@Override
	public void startProcessing() {
		System.out.println("StartProcessing: State: IssueInProgress ");
		System.out.println("Process: Working on the fix.");
		System.out.println("Process: Issue log updated in JIRA");
	}
	@Override
	public void complete(StateContext context) {
		System.out.println("Complete : State: IssueInProgress ");
		context.setIssueState(new IssueDone());
	}
}
