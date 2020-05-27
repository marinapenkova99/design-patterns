package decoratorAndFacade;

public class Main {
    public static void main(String[] args) {

        BurgerFacade burgerFacade = new BurgerFacade();
        burgerFacade.makeCheeseBurger();
        burgerFacade.makeBurgerWithEgg();
        burgerFacade.makeClassicBurger();
    }
}
