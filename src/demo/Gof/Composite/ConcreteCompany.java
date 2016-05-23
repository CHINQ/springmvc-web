package demo.Gof.Composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 83708 on 2016/5/20.
 */
public class ConcreteCompany extends Company {
    private List<Company>children=new ArrayList<Company>();
    public ConcreteCompany(String name){
        super(name);
    }

    @Override
    public void Add(Company c) {
        children.add(c);
    }

    @Override
    public void Remove(Company c) {
        children.remove(c);
    }

    @Override
    public void Display(int depth) {
        System.out.println(depth+"-"+name);
        for (Company component:
             children) {
            component.Display(depth+2);
        }
    }

    @Override
    public void LineOfDuty() {
        for (Company component:
             children) {
            component.LineOfDuty();
        }
    }
}
