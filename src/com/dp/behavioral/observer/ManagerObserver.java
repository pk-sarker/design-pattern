/**
 * 
 */
package com.dp.behavioral.observer;

/**
 * @author pijus
 *
 */
public class ManagerObserver extends Observer {
    ManagerObserver(Bug bug) {
        this.bug = bug;
        this.bug.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "> Notify manager about bug "+this.bug.getBugNumber());
    }
}
