package chainOfResponsibilityStateAndObserver;

public class StartState implements State{
    public void doAction(Context context) {
        System.out.println("Идва клиент и съответния служител приема пратката");
        context.setState(this);
    }

}
