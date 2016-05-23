package demo.Gof.Singleton;

/**
 * Created by 83708 on 2016/5/23.
 */
public class Main {
    public static void main(String[]args){
        SingletonLazy o= SingletonLazy.GetInstance();
        SingletonLazy t= SingletonLazy.GetInstance();
        if(o==t){
            System.out.println("两个对象是相同的实例");
        }
    }
}
