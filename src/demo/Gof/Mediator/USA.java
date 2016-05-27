package demo.Gof.Mediator;

/**
 * Created by 83708 on 2016/5/27.
 */
public class USA extends Country {
    public USA(UniteNations mediator){
        super(mediator);
    }
    public void Declare(String message){
        mediator.Declare(message,this);
    }
    public void GetMessage(String message){
        System.out.println("美国获得对方消息："+message);
    }
}
