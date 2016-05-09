package tree.java.Gof.Strategy;

/**
 * Created by 83708 on 2016/3/4.
 */
public class CashRebate extends CashSuper {
    private double rebateNum=1d;
    public CashRebate(String rebateNum) {
        this.rebateNum=Double.parseDouble(rebateNum);
    }
    public double acceptCash(double money){
        return money*rebateNum;
    }
}
