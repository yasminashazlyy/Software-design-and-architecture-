package app;

import java.util.*;

public class OfferNotifier implements Notifier {
    int offer;
    ArrayList observers = new ArrayList();

    public void registerObserver(Observer obsv) {
        observers.add(obsv);
    }

    public void removeObserver(Observer obsv) {
        int i = observers.indexOf(obsv);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    public void notifyObservers() {
        int i=0;
        Observer observer = (Observer) observers.get(i);
        observer.display( offer );
        i++;

    }
    public void changedOffer() {
        notifyObservers();
    }
    public void SetOffer( Integer obsv)
    {
        this.offer=obsv;
        changedOffer();

    }


}
