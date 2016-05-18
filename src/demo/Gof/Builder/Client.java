package demo.Gof.Builder;

/**
 * Created by 83708 on 2016/3/9.
 */
//客户
public class Client {
    public static void main(String[] args) {
        Waiter waiter=new Waiter();
        StarbucksBuilder coffeebuild=new CoffeeBuilder();

        waiter.setStarbucksBuilder(coffeebuild);
        waiter.construcStarbucks();

        Starbucks drink=waiter.getstarbucksDrink();
    }
}
