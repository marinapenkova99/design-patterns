package chainOfResponsibilityStateAndObserver;

public class ShipmentState implements State {
    public void doAction(Context context) {
        System.out.println("Пратките са в състояние на подготовка и идва друг служител, за да ги вземе");
        context.setState(this);
    }
}
