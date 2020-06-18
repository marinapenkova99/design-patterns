package chainOfResponsibilityStateAndObserver;
import java.util.ArrayList;
import java.util.List;

public class Shipment implements Subject {

    private List<Observer> observers = new ArrayList<Observer>();
    private String name;

    public void setName(String name) {
        this.name = name;
        this.notifyAllObservers();
    }

    @Override
    public void takeShipment(Observer observer) {
        this.observers.add(observer);
        observer.setShipment(this);
    }

    @Override
    public void notTakingShipment(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyAllObservers() {
        for (Observer observer : this.observers) {
            observer.update();
        }
    }

    @Override
    public String getUpdate() {
        return this.name;
    }
}