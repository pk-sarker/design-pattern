package com.dp.behavioral.state;

public class IssueTesting implements IssueState {
	@Override
	public void startProcessing() {
		System.out.println("StartProcessing: State: IssueTesting ");
		System.out.println("Process: Test case prepare");
		System.out.println("Process: Test case execution");
		System.out.println("Process: Issue log updated in JIRA");
	}
	@Override
	public void complete(StateContext context) {
		System.out.println("Complete : State: IssueTesting ");
		context.setIssueState(new IssueClose());
	}
}
