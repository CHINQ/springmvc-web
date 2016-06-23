package demo.Gof.Vistor;

/**
 * Created by 83708 on 2016/6/23.
 */
public class ConcreateElemntB extends Element{
    @Override
    public void Accept(Visitor visitor) {
        visitor.VisitConcreateElementB(this);
    }
    public void OperationB(){};
}
