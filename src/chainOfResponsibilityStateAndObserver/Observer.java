package chainOfResponsibilityStateAndObserver;

public interface Observer {
    public void update();
    public void setShipment(Subject shipment);
}