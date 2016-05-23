package demo.Gof.Iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 83708 on 2016/5/23.
 */
public class ConcreteAggregate extends Aggregate{
    private List<Object>items=new ArrayList<Object>();

    public List<Object> getItems() {
        return items;
    }

    public void setItems(List<Object> items) {
        this.items = items;
    }

    @Override
    public Interator CreateInterator() {
        return new ConcreteInterator(this);
    }
    public int Count;

    public int getCount() {
        return Count;
    }

    public void setCount(int count) {
        Count = count;
    }

}
