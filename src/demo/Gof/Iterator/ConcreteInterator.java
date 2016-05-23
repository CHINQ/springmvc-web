package demo.Gof.Iterator;

/**
 * Created by 83708 on 2016/5/23.
 */
public class ConcreteInterator extends Interator {
    private ConcreteAggregate aggregate;
    private int current=0;
    public ConcreteInterator(ConcreteAggregate aggregate){
        this.aggregate=aggregate;
    }
    public Object First(){
        return aggregate.getItems().get(0);
    }
    public Object Next(){
        Object ret=null;
        current++;
        if(current<aggregate.Count){
            ret=aggregate.getItems().get(current);
        }
        return ret;
    }

    @Override
    public boolean IsDone() {
        return current>=aggregate.Count?true:false;
    }

    @Override
    public Object CurrentItem() {
        return aggregate.getItems().get(current);
    }
}
