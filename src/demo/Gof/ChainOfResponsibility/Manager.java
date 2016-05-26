package demo.Gof.ChainOfResponsibility;

/**
 * Created by 83708 on 2016/5/26.
 */
public abstract class Manager {
    protected String name;
    protected Manager superior;
    public Manager(String name){
        this.name=name;
    }
    public void SetSuperior(Manager superior){
        this.superior=superior;
    }
    public abstract void RequestApplications(Request request);
}
