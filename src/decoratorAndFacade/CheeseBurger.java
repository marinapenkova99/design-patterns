package decoratorAndFacade;

public class CheeseBurger implements Burger{
    private String title;

    public String getTitle() {
        return title;
    }
    public CheeseBurger(String title){
        super();
        this.title=title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    @Override
    public void makeBurger(){
        System.out.println("\n" + getTitle() + "\n" + "\nExtra: add cheese.");
    }
}
