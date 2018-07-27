/**
 * 
 */
package com.dp.behavioral.observer;

/**
 * @author pijus
 *
 */
public class ObserverPatternMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bug bug = new Bug();

        new TesterObserver(bug);
        new ManagerObserver(bug);
        new DeveloperObserver(bug);

        System.out.println("First state change: BUG-1001");
        bug.setBugNumber("BUG-1001");

        System.out.println("Second state change: BUG-2103");
        bug.setBugNumber("BUG-2103");

	}

}
