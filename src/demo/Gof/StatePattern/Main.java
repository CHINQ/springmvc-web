package demo.Gof.StatePattern;

/**
 * Created by 83708 on 2016/5/19.
 */
public class Main {
    public static void main(String[]args){
        Work work=new Work();
        work.setHour(12);
        work.setFinish(true);
        work.WriteProgram();
    }
}
