package demo.Gof.StatePattern;

/**
 * Created by 83708 on 2016/5/19.
 */
public class ForenconState extends State {
    public void WriteProgram(Work w){
        if(w.getHour()<12){
            System.out.printf("当前时间:%s,上午工作，精神百倍",w.getHour());
        }else{
            w.setCurrent(new NoonState());
            w.WriteProgram();
        }
    }
}
