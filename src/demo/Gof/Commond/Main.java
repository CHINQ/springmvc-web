package demo.Gof.Commond;

/**
 * Created by 83708 on 2016/5/25.
 */
public class Main {
    public static void main(String[]args){
        Barbecuer boy=new Barbecuer();
        Command bk=new BakeMuttonCommand(boy);
        Waiter girl=new Waiter();
        girl.SetOrder(bk);
        girl.Notify();
    }
}
