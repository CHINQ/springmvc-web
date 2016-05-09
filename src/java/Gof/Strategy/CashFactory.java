package tree.java.Gof.Strategy;

/**
 * Created by 83708 on 2016/3/4.
 */
public class CashFactory {
    public static CashSuper CreateCashAccept(String type){
        CashSuper cs=null;
        switch (type){
            case "正常收费":
                cs=new CashNormal();
                break;
            case "满300减100":
                CashReturn ret=new CashReturn("300","100");
                cs=ret;
                break;
            case "打8折":
                CashRebate reb=new CashRebate("0.8");
                cs=reb;
                break;
        }
        return cs;
    }
}
