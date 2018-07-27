/**
 * 
 */
package com.dp.behavioral.observer;

/**
 * @author pijus
 *
 */
public class TesterObserver extends Observer {
	TesterObserver(Bug bug) {
        this.bug = bug;
        this.bug.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "> Notify tester about bug "+this.bug.getBugNumber());
    }

}
