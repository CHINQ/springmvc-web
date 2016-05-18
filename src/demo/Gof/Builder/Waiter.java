package demo.Gof.Builder;

/**
 * Created by 83708 on 2016/3/14.
 */
public class Waiter {
    private StarbucksBuilder starbucksBuilder;
    public void setStarbucksBuilder(StarbucksBuilder builder){
        starbucksBuilder=builder;
    }
    public Starbucks getstarbucksDrink(){
        return starbucksBuilder.getStarbucks();
    }
    public void construcStarbucks(){
        starbucksBuilder.creatStarbucks();
        starbucksBuilder.buildSize();
        starbucksBuilder.buildDrink();
    }
}
