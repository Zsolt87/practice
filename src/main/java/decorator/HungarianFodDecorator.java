package decorator;

public class HungarianFodDecorator extends AbsrtactFoodDecorator {
    public HungarianFodDecorator(Food decoratedFood) {
        super(decoratedFood);
    }

    @Override
    public void prepare(){
        System.out.println("Hungarian");
        super.prepare();
    }
}
