package demo.Gof.Vistor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 83708 on 2016/6/23.
 */
public class ObjectStructure {
    private List<Element>elements=new ArrayList<Element>();
    public void Attach(Element element){
        elements.add(element);
    }
    public void Detach(Element element){
        elements.remove(element);
    }
    public void Accept(Visitor visitor){
        for (Element e:elements){
            e.Accept(visitor);
        }
    }
}
