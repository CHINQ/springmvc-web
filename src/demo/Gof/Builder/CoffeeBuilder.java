package demo.Gof.Builder;

/**
 * Created by 83708 on 2016/3/14.
 */
public class CoffeeBuilder extends StarbucksBuilder {
    @Override
    public void buildSize() {
        starbucks.setSize("medium");
        System.out.println("build medium size");
    }

    @Override
    public void buildDrink() {
        starbucks.setDiink("coffee");
        System.out.println("build coffee");
    }
}
