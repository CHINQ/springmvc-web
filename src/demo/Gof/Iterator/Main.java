package demo.Gof.Iterator;

/**
 * Created by 83708 on 2016/5/23.
 */
public class Main {
    public static void main(String[]args){
        ConcreteAggregate a=new ConcreteAggregate();
        a.getItems().add(0,"大鸟");
        a.getItems().add(1,"小鸟");
        Interator i=new ConcreteInterator(a);
        Object item=i.First();
        while(i.IsDone()){
            System.out.printf("%s,请买车票",i.CurrentItem());
            i.Next();
        }
    }
}
