package com.dp.behavioral.state;

public class IssueClose implements IssueState {
	@Override
	public void startProcessing() {
		System.out.println("StartProcessing: State: IssueClose ");
		System.out.println("Process: Issue log updated in JIRA");
	}
	
	@Override
	public void complete(StateContext context) {
		System.out.println("Complete : State: IssueClose ");
	}

}
