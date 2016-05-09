package tree.java.Gof.Facade;

/**
 * Created by 83708 on 2016/3/9.
 */
public class Fund {
    Stock1 s1;
    Stock2 s2;
    public Fund(){
        s1=new Stock1();
        s2=new Stock2();
    }
    public void FundBuy(){
        s1.Buy();
        s2.Buy();
    }
    public void FundSell(){
        s1.Sell();
        s2.Sell();
    }
}
