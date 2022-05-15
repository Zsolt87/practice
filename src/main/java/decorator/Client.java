package decorator;

public class Client {
    public static void main(String[] args) {
        Food food = new HungarianFodDecorator(new VeganFood());
        food.prepare();
    }
}
