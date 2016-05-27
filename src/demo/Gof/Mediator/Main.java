package demo.Gof.Mediator;

/**
 * Created by 83708 on 2016/5/27.
 */
public class Main {
    public static void main(String[]args){
        UniteNationsSecurityCouncil un=new UniteNationsSecurityCouncil();
        USA c1=new USA(un);
        Iraq c2=new Iraq(un);

        un.setColleaguel1(c1);
        un.setColleaguel2(c2);

        c1.Declare("不准研制核武器，否则要发动战争");
        c2.Declare("我们没有核武器，也不怕侵略");
    }
}
