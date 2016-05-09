package tree.java.Gof.Decorator;

/**
 * Created by 83708 on 2016/3/7.
 */
public class WearTShirts extends Finery{
    @Override
    public void Show() {
        System.out.println("大T恤");
        super.Show();
    }
}
