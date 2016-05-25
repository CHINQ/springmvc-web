package demo.Gof.Commond;

/**
 * Created by 83708 on 2016/5/25.
 */
public class BakeMuttonCommand extends Command {
    public BakeMuttonCommand(Barbecuer barbecuer){
        super(barbecuer);
    }

    @Override
    public void ExcuteCommand() {
        receiver.BakeMutton();
    }
}
