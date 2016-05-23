package demo.Gof.Composite;

/**
 * Created by 83708 on 2016/5/20.
 */
public class Main {
    public static void main(String[]args){
        ConcreteCompany root=new ConcreteCompany("总公司");
        root.Add(new HRDepartment("总公司人力资源部"));

        ConcreteCompany comp=new ConcreteCompany("上海分公司");
        comp.Add(new HRDepartment("上海人力资源部"));
        root.Add(comp);

        System.out.println("\n结构图：");
        root.Display(1);

        System.out.println("\n职责：");
        root.LineOfDuty();
    }
}
