package demo.Gof.Singleton;

/**
 * Created by 83708 on 2016/5/23.
 */
public class SingletonHungry {
    private static final SingletonHungry instance=new SingletonHungry();
    private SingletonHungry(){};
    public static SingletonHungry GetInstance(){
        return instance;
    }
}
