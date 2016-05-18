package demo.Gof.ObserverPattern;

import java.util.ArrayList;

/**
 * Created by 83708 on 2016/5/18.
 */
public class Boss implements Subject{
    private ArrayList<Observer> observers=new ArrayList<Observer>();
    private String SubjectState;
    public void Attach(Observer observer){
        observers.add(observer);
    };
    public void Detach(Observer observer){
        observers.remove(observer);
    };
    public void Notify(){
        for(Observer o: observers){
            o.Update();
        }
    };
    public String getSubjectState() {
        return SubjectState;
    }
    public void setSubjectState(String subjectState) {
        SubjectState = subjectState;
    }
}
