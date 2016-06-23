package demo.Gof.Vistor;

/**
 * Created by 83708 on 2016/6/23.
 */
public class Main {
    public static void main(String[]args){
        ObjectStructure o=new ObjectStructure();
        o.Attach(new ConcreateElemntA());
        o.Attach(new ConcreateElemntB());
        ConCreateVisitorl v1=new ConCreateVisitorl();
        o.Accept(v1);
    }
}
