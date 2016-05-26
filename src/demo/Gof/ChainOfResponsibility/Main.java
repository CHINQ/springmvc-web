package demo.Gof.ChainOfResponsibility;

/**
 * Created by 83708 on 2016/5/26.
 */
public class Main
{
    public static void main(String[]args){
        CommonManager p1=new CommonManager("A");
        Majordomo p2=new Majordomo("B");
        p1.SetSuperior(p2);

        Request re=new Request();
        re.setRequestType("请假");
        re.setRequestContent("小C请假");
        re.setNumber(3);
        p1.RequestApplications(re);
    }
}
