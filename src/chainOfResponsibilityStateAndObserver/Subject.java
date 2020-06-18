package chainOfResponsibilityStateAndObserver;

public interface Subject {
    public void takeShipment(Observer observer);
    public void notTakingShipment(Observer observer);
    public void notifyAllObservers();
    public String getUpdate();
}
