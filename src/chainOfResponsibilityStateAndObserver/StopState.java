package chainOfResponsibilityStateAndObserver;

public class StopState implements State{
    public void doAction(Context context) {
        System.out.println("Служителят стои и чака следващ клиент");
        context.setState(this);
    }
}
