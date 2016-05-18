package demo.Gof.Strategy;

/**
 * Created by 83708 on 2016/3/4.
 */
public class CashClient {

    private static void client(){
        double total=0.0d;//总计
//        CashSuper csuper=CashFactory.CreateCashAccept("满300减100");
        double totalPrices=0d;
        String txtnum="5";
        String txtprices="300";
//        totalPrices=csuper.acceptCash(Double.parseDouble(txtnum)*Double.parseDouble(txtprices));

//        CashContext cc=null;
        String type="满300减100";
//        switch (type){
//            case "正常收费":
//                cc=new CashContext(new CashNormal());
//                break;
//            case "满300减100":
//                cc=new CashContext(new CashReturn("300","100"));
//                break;
//            case "打8折":
//                cc=new CashContext(new CashRebate("0.8"));
//                break;
//        }
        CashContext csuper=new CashContext(type);
        totalPrices=csuper.GetResult(Double.parseDouble(txtnum)*Double.parseDouble(txtprices));
        total=total+totalPrices;
        System.out.println("单价："+txtprices+"数量："+txtnum+"合计："+total);
    }
    public static void main(String[]args){
        client();
    }
}
