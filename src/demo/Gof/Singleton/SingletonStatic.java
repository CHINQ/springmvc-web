package demo.Gof.Singleton;

/**
 * Created by 83708 on 2016/5/23.
 */
public class SingletonStatic {
    private static class SingletonHolder{
        private static final SingletonStatic INSTANCE=new SingletonStatic();
    }
    private SingletonStatic(){};
    public static final SingletonStatic getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
