package chainOfResponsibilityStateAndObserver;

public class DeliveryMain {
    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());
        Shipment shipment = new Shipment();
        Shipment shipment2 = new Shipment();
        Shipment shipment3 = new Shipment();
        Observer obs1 = new EmployeeTypeShipment("Служител 1");
        Observer obs2 = new EmployeeTypeShipment("Служител 2");
        Observer obs3 = new EmployeeTypeShipment("Служител 3");

        shipment.takeShipment(obs1);
        shipment2.takeShipment(obs2);
        shipment3.takeShipment(obs3);

        shipment.setName("пратка за чужбина");
        shipment2.setName("държавна пратка");
        shipment3.setName("пратка за град Пловдив");
        ShipmentState shipmentState = new ShipmentState();
        shipmentState.doAction(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());


    }
}
