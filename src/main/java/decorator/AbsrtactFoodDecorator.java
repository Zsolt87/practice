package decorator;

import lombok.Data;

@Data
public class AbsrtactFoodDecorator implements Food {
    private final Food decoratedFood;

    @Override
    public void prepare() {
        decoratedFood.prepare();
    }
}
