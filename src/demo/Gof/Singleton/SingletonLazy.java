package demo.Gof.Singleton;

/**
 * Created by 83708 on 2016/5/23.
 */
public class SingletonLazy {
    private static SingletonLazy instance;
    private SingletonLazy(){};
    public static SingletonLazy GetInstance(){
        if(instance==null){
            instance=new SingletonLazy();
        }
        return instance;
    }
}
