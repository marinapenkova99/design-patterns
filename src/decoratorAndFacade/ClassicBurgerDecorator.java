package decoratorAndFacade;

public class ClassicBurgerDecorator implements Burger {

    @Override
    public void makeBurger() {
        addTwoPiecesOfBread();
        addBurgerMeat();
        addLettuce();
        addKetchup();
        addCucumber();
    }

    public void addTwoPiecesOfBread() {
        //...
        System.out.println("First add two pieces of bread");
    }
    private void addBurgerMeat() {
        //...
        System.out.println("Second add burger meat");
    }
    private void addLettuce() {
        //...
        System.out.println("Third add lettuce");
    }
    private void addKetchup() {
        //...
        System.out.println("Fourth add ketchup");
    }
    private void addCucumber() {
        //...
        System.out.println("Fifth add cucumber");
    }
}
