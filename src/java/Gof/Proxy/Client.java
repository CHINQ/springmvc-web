package tree.java.Gof.Proxy;

/**
 * Created by 83708 on 2016/3/8.
 */
public class Client {
    public static void main(String[]args){
        SchoolGirl mm=new SchoolGirl();
        mm.setName("jiaojiao Li");
        Proxy daili=new Proxy(mm);
        daili.GiveDolls();
        daili.GiveFlowers();
        daili.GiveChocolate();
    }
}
