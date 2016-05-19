package demo.Gof.Observer;

/**
 * Created by 83708 on 2016/5/17.
 */
abstract class Observer {
    protected String name;
    protected Subject sub;
    public Observer(String name, Subject sub){
        this.name=name;
        this.sub=sub;
    }
    public abstract void Update();
}
