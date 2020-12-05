package com.pa.patterns.observerimpl.observer;
/**
 *
 * @author patriciamacedo
 */
public interface Observable {
    /**
     *  Attach  observers to the subject.
     * @param observers  to be attached
     */
    public void addObservers(Observer... observers);
    /**
     *  Attach  observers to the subject.
     * @param observer to be removed
     */
    public void removeObservers(Observer observer);

    public void notifyObservers(Object object);
}
