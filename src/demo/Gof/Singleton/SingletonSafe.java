package demo.Gof.Singleton;

/**
 * Created by 83708 on 2016/5/23.
 */
public class SingletonSafe {
    private static SingletonSafe instance;
    private SingletonSafe(){};
    public static synchronized SingletonSafe GetInstance(){
        if(instance==null){
            instance=new SingletonSafe();
        }
        return instance;
    }
}
