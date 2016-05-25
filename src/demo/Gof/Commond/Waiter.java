package demo.Gof.Commond;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 83708 on 2016/5/25.
 */
public class Waiter
{
    private List<Command> oeders=new ArrayList<Command>();
    public void SetOrder(Command command){
        if(command.toString().equals("demo.Gof.Commond.BakeMuttonCommand@355da254")){
            System.out.println("羊肉没有了，请点别的烧烤");
        }else{
            oeders.add(command);
            System.out.println("增加订单："+command.toString());
        }
    }
    public void CancelOrder(Command command){
        oeders.remove(command);
        System.out.println("取消订单："+command.toString());
    }
    public void Notify(){
        for (Command cmd:
             oeders) {
            cmd.ExcuteCommand();
        }
    }
}
