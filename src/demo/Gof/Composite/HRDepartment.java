package demo.Gof.Composite;

/**
 * Created by 83708 on 2016/5/20.
 */
public class HRDepartment extends Company{
    public HRDepartment(String name){
        super(name);
    }

    @Override
    public void Add(Company c) {

    }

    @Override
    public void Remove(Company c) {

    }

    @Override
    public void Display(int depth) {
        System.out.println(depth+"-"+name);
    }

    @Override
    public void LineOfDuty() {
        System.out.printf("%s员工招聘培训管理",name);
    }
}
