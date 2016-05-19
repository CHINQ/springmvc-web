package demo.Gof.Observer;

/**
 * Created by 83708 on 2016/5/17.
 */
public interface Subject {
    public void Attach(Observer observer);
    public void Detach(Observer observer);
    public void Notify();
    public String getSubjectState();
    public void setSubjectState(String subjectState);
}
