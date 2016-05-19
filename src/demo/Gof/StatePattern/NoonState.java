package demo.Gof.StatePattern;

/**
 * Created by 83708 on 2016/5/19.
 */
public class NoonState extends State {
    public void WriteProgram(Work w){
        if(w.getHour()<13){
            System.out.printf("当前时间:%s,饿了，午饭，困了，午休",w.getHour());
        }
    }
}
