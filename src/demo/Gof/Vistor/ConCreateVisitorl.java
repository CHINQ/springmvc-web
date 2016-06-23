package demo.Gof.Vistor;

/**
 * Created by 83708 on 2016/6/23.
 */
public class ConCreateVisitorl extends Visitor {
    @Override
    public void VisitConcreateElementA(ConcreateElemntA concreateElemntA) {
        System.out.printf("%s被%s访问",concreateElemntA.getClass().getName(),this.getClass().getName());
    }

    @Override
    public void VisitConcreateElementB(ConcreateElemntB concreateElemntB) {
        System.out.printf("%s被%s访问",concreateElemntB.getClass().getName(),this.getClass().getName());
    }
}
