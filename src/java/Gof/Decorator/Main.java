package tree.java.Gof.Decorator;

/**
 * Created by 83708 on 2016/3/7.
 */
public class Main {
    public static void main(String[] args) {
        Person p = new Person("Tom");
        System.out.println("第一种装扮");
        WearSneakers wsk=new WearSneakers();
        WearBigTrouser wbt=new WearBigTrouser();
        WearTShirts wts=new WearTShirts();
        wsk.Decorate(p);
        wbt.Decorate(wsk);
        wts.Decorate(wbt);
        wts.Show();
    }

}