package tree.java.Gof.FactoryMethodPattern;

/**
 * Created by 83708 on 2016/3/8.
 */
public class UndergraduateFactory implements IFactory {
    public LeiFeng CreateLeiFeng(){
        return new Undergraduate();
    }
}
