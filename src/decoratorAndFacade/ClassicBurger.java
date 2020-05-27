package decoratorAndFacade;

public class ClassicBurger implements Burger{
    private String title;

    public String getTitle() {
        return title;
    }
    public ClassicBurger(String title){
        super();
        this.title=title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    @Override
    public void makeBurger(){
     System.out.println("\n" +getTitle() + "\n" + "\nClassic burger is made with these steps:");
 }
}
