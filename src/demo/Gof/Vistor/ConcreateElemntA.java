package demo.Gof.Vistor;

/**
 * Created by 83708 on 2016/6/23.
 */
public class ConcreateElemntA extends Element{
    @Override
    public void Accept(Visitor visitor) {
        visitor.VisitConcreateElementA(this);
    }
    public void OperationA(){};
}
