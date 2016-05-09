package tree.java.Gof.Decorator;

/**
 * Created by 83708 on 2016/3/7.
 */
public class Finery extends Person{
    protected Person componet;
    //打扮
    public void Decorate(Person componet){
        this.componet=componet;
    }
    @Override
    public void Show(){
        if(componet!=null){
            componet.Show();
        }
    }
}
