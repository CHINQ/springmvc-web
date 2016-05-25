package demo.Gof.Commond;

/**
 * Created by 83708 on 2016/5/25.
 */
public abstract class Command {
    protected Barbecuer receiver;
    public Command(Barbecuer receiver){
        this.receiver=receiver;
    }
    public abstract void ExcuteCommand();
}
