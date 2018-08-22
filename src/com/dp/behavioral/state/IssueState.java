package com.dp.behavioral.state;

public interface IssueState {
	public static String issueId = "";
	
	public void startProcessing();
	public void complete(StateContext context);
}
