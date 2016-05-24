package demo.Gof.Bridge;

/**
 * Created by 83708 on 2016/5/24.
 */
public class Main {
    public static void main(String[]args){
        HandsetBrand hb;
        hb=new HandsetBrandN();
        hb.SetHandsetSoft(new HandsetAddressList());
        hb.Run();
    }
}
