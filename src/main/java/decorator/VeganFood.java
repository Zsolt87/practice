package decorator;

public class VeganFood implements Food {

    @Override
    public void prepare() {
        System.out.println("Vegan food");
    }
}
