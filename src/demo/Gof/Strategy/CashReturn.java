package demo.Gof.Strategy;

/**
 * Created by 83708 on 2016/3/4.
 */
public class CashReturn extends CashSuper {
    private double moneyCondition=0.0d;
    private double moneyReturn=0.0d;

    public CashReturn(String moneyCondition, String moneyReturn) {
        this.moneyCondition=Double.parseDouble(moneyCondition);
        this.moneyReturn=Double.parseDouble(moneyReturn);
    }
    public double acceptCash(double money){
        double result=money;
        if(money>=moneyCondition){
            result=money-Math.floor(money/moneyCondition)*moneyReturn;
        }
        return result;
    }
}
