package tree.java.Gof.Builder;

/**
 * Created by 83708 on 2016/3/14.
 */
public abstract class StarbucksBuilder {
    protected Starbucks starbucks;
    public Starbucks getStarbucks(){
        return starbucks;
    }
    public void creatStarbucks(){
        starbucks=new Starbucks();
        System.out.println("a drink is created");
    }
    public abstract void buildSize();
    public abstract void buildDrink();
}
