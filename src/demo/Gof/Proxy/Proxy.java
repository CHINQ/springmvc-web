package demo.Gof.Proxy;

/**
 * Created by 83708 on 2016/3/8.
 */
public class Proxy implements GiveGift {
    Pursuit gg;
    public Proxy(SchoolGirl mm){
        gg=new Pursuit(mm);
    }
    public void GiveDolls(){
        gg.GiveDolls();
    }
    public  void GiveFlowers(){
        gg.GiveFlowers();
    }
    public void GiveChocolate(){
        gg.GiveChocolate();
    }
}
