package com.dp.behavioral.state;

public class StateContext {
	private IssueState issueState;

	StateContext(IssueState issueState) {
		this.setIssueState(issueState);
	}
	public IssueState getIssueState() {
		return issueState;
	}

	public void setIssueState(IssueState issueState) {
		this.issueState = issueState;
	}
	
	public void startProcessing() {
		this.getIssueState().startProcessing();
	}
	
	public void complete() {
		this.getIssueState().complete(this);
	}
	
	
}
