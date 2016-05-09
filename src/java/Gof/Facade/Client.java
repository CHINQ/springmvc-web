package tree.java.Gof.Facade;

/**
 * Created by 83708 on 2016/3/9.
 */
public class Client {
    public static void main(String[]args){
        Fund f=new Fund();
        f.FundBuy();
        f.FundSell();
    }
}
