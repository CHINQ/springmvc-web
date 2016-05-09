package tree.java.Gof.Builder;

/**
 * Created by 83708 on 2016/3/14.
 */
public class TeaBuilder extends StarbucksBuilder{
    @Override
    public void buildSize() {
        starbucks.setSize("large");
        System.out.println("build large size");
    }

    @Override
    public void buildDrink() {
        starbucks.setDiink("tea");
        System.out.println("build tea");
    }
}
