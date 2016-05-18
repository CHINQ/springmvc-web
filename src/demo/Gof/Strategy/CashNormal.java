package demo.Gof.Strategy;

/**
 * Created by 83708 on 2016/3/4.
 */
public class CashNormal extends CashSuper {
    public double acceptCash(double money){
        return money;
    }
}
