package demo.Gof.Strategy;

/**
 * Created by 83708 on 2016/3/7.
 */
public class CashContext {
    private CashSuper cs;
//    public CashContext(CashSuper csuper){
//        this.cs=csuper;
//    }
public CashContext(String type){
    switch (type){
        case "正常收费":
            CashNormal cor=new CashNormal();
            cs=cor;
            break;
        case "满300减100":
            CashReturn cet=new CashReturn("300","100");
            cs=cet;
            break;
        case "打8折":
            CashRebate ceb=new CashRebate("0.8");
            cs=ceb;
            break;
    }
}
    public double GetResult(double money){
        return cs.acceptCash(money);
    }
}
