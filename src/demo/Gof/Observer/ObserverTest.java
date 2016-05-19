package demo.Gof.Observer;
/**
 * Created by 83708 on 2016/5/17.
 */
public class ObserverTest {
    public static void main(String[]args){
        Boss qt=new Boss();
        StockObserver wk1=new StockObserver("魏",qt);
        NBAObserver wk2=new NBAObserver("易",qt);
        qt.Attach(wk1);
        qt.Attach(wk2);
        qt.Detach(wk1);
        qt.setSubjectState("我胡汉三回来了");
        qt.Notify();
    }
}
