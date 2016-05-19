package demo.Gof.Adapter;

/**
 * Created by 83708 on 2016/5/19.
 */
public class Forwards extends Player{
    public Forwards(String name){
        super(name);
    }
    public void Attach(){
        System.out.printf("%s前锋进攻",name);
    }
    public void Defense(){
        System.out.printf("%s前锋防守",name);
    }


}
