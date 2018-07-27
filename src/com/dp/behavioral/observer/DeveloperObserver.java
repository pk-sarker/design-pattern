/**
 * 
 */
package com.dp.behavioral.observer;

/**
 * @author pijus
 *
 */
public class DeveloperObserver extends Observer {
    DeveloperObserver(Bug bug) {
        this.bug = bug;
        this.bug.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "* Notify developer about bug "+this.bug.getBugNumber());
    }
}
