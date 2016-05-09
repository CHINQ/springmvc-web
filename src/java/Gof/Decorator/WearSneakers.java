package tree.java.Gof.Decorator;

/**
 * Created by 83708 on 2016/3/7.
 */
public class WearSneakers extends Finery{
    @Override
    public void Show(){
        System.out.println("破球鞋");
        super.Show();
    }
}
