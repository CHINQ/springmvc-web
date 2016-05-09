package tree.java.Gof.Prototype;

/**
 * Created by 83708 on 2016/3/8.
 */
public class WorkExperience implements Cloneable
{
    private String workDate;
    private String company;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getWorkDate() {
        return workDate;
    }

    public void setWorkDate(String workDate) {
        this.workDate = workDate;
    }
    public Object Clone() throws CloneNotSupportedException {
        return this.clone();
    }
}
