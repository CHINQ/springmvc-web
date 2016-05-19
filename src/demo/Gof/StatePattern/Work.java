package demo.Gof.StatePattern;

/**
 * Created by 83708 on 2016/5/19.
 */
public class Work {
    private State current;
    public Work(){
        current=new ForenconState();
    }

    public State getCurrent() {
        return current;
    }

    public void setCurrent(State current) {
        this.current = current;
    }

    private int hour;
    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }
    private boolean finish=false;

    public boolean isFinish() {
        return finish;
    }

    public void setFinish(boolean finish) {
        this.finish = finish;
    }
    public void WriteProgram(){
        current.WriteProgram(this);
//        if(hour<12){
//            System.out.printf("当前时间:%s,上午工作，精神百倍",hour);
//        }else if(hour<13){
//            System.out.printf("当前时间:%s,饿了，午饭，困了，午休",hour);
//        }else if(hour<17){
//            System.out.printf("当前时间:%s,下午状态还不错，继续努力",hour);
//        }else{
//            if(finish){
//                System.out.printf("当前时间:%s,下班回家了",hour);
//            }else{
//                if(hour<21){
//                    System.out.printf("当前时间:%s,加班哦，疲劳之极",hour);
//                }else{
//                    System.out.printf("当前时间:%s,睡着了",hour);
//                }
//            }
//        }
    }
}
