package demo.Gof.Singleton;

/**
 * Created by 83708 on 2016/5/23.
 */
public class SingletonLock {
    private volatile static SingletonLock instance;
    private SingletonLock(){};
    public static SingletonLock GetInstance(){
        if(instance==null){
            synchronized (SingletonLock.class){
                if(instance==null){
                    instance=new SingletonLock();
                }
            }
        }
        return instance;
    }
}
