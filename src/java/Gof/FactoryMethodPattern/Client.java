package tree.java.Gof.FactoryMethodPattern;

/**
 * Created by 83708 on 2016/3/8.
 */
public class Client {
    public static void main(String[]args){
//        LeiFeng xueleifeng=SimpleFactory.CreatELeiFeng("学雷锋的大学生");
        IFactory factory=new UndergraduateFactory();
        LeiFeng student=factory.CreateLeiFeng();
        student.BuyRice();
        student.Sweep();
        student.Wash();
    }
}
