package demo.Gof.ObserverPattern;

/**
 * Created by 83708 on 2016/5/17.
 */
public class NBAObserver extends Observer {
    public NBAObserver(String name,Subject sub){
        super(name,sub);
    }
    @Override
    public void Update(){
        System.out.printf("%s=%s%n 关闭NBA，继续工作！\r\n",sub.getSubjectState(),name);
    }
}
