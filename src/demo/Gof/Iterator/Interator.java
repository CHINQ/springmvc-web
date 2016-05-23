package demo.Gof.Iterator;

/**
 * Created by 83708 on 2016/5/20.
 */
public abstract class Interator {
    public abstract Object First();
    public abstract Object Next();
    public abstract boolean IsDone();
    public abstract Object CurrentItem();
}
