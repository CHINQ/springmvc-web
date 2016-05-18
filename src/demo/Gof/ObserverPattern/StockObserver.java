package demo.Gof.ObserverPattern;

/**
 * Created by 83708 on 2016/5/17.
 */
public class StockObserver extends Observer{
    public StockObserver(String name,Subject sub){
        super(name,sub);
    }
    @Override
    public void Update(){
        System.out.printf("%s=%s%n 关闭股票行情，继续工作！\r\n",sub.getSubjectState(),name);
    }
}
