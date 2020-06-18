package chainOfResponsibilityStateAndObserver;

public class EmployeeTypeShipment implements Observer{
    private String name;
    private Subject shipment;

    public EmployeeTypeShipment(String name) {
        this.setName(name);
    }

    @Override
    public void update() {
        if(shipment == null) {
            System.out.println("Няма пратка");
            return;
        }

        String shipmentType = shipment.getUpdate();
        System.out.println(this.getName() + " приема: "  + shipmentType);

    }
    @Override
    public void setShipment(Subject shipment) {
        this.shipment = shipment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
