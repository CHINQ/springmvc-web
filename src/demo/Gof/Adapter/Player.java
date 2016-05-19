package demo.Gof.Adapter;

/**
 * Created by 83708 on 2016/5/19.
 */
public abstract class Player {
    protected String name;
    public Player(String name){
        this.name=name;
    }
    public abstract void Attach();
    public abstract void Defense();
}
