package decoratorAndFacade;

public class BurgerFacade {
    private Burger classicBurger;
    private Burger cheeseBurger;
    private Burger burgerWithEgg;
    private Burger classicBurgerDecorator;

    public BurgerFacade() {
        this.classicBurger = new ClassicBurger("Classic Burger");
        this.cheeseBurger = new CheeseBurger("CheeseBurger");
        this.burgerWithEgg = new BurgerWithEgg("Burger with egg");
        this.classicBurgerDecorator = new ClassicBurgerDecorator();
    }

    public void makeClassicBurger() {
        //...
        this.classicBurger.makeBurger();
        this.classicBurgerDecorator.makeBurger();
    }

    public void makeCheeseBurger() {
        //..
        //...
        //....
        this.cheeseBurger.makeBurger();
        this.classicBurgerDecorator.makeBurger();
    }

    public void makeBurgerWithEgg() {
        //..
        //...
        //....
        this.burgerWithEgg.makeBurger();
        this.classicBurgerDecorator.makeBurger();
    }
}
