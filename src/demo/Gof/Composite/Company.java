package demo.Gof.Composite;

/**
 * Created by 83708 on 2016/5/20.
 */
public abstract class Company
{
    protected String name;
    public Company(String name){
        this.name=name;
    }
    public abstract void Add(Company c);
    public abstract void Remove(Company c);
    public abstract void Display(int depth);
    public abstract void LineOfDuty();
}
