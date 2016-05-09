package tree.java.Gof.Prototype;

/**
 * Created by 83708 on 2016/3/8.
 */
public class Resume implements Cloneable {
    private String name;
    private String sex;
    private String age;
    private WorkExperience work;
    public Resume(String name){
        this.name=name;
        work=new WorkExperience();
    }
    private Resume(WorkExperience work){
        try {
            this.work=(WorkExperience)work.Clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
    //设置个人信息
    public void SetPersonalInfo(String sex,String age){
        this.sex=sex;
        this.age=age;
    }
    //设置工作经历
    public void SetWorkExperience(String timeArea,String company){
        work.setWorkDate(timeArea);
        work.setCompany(company);
    }
    //显示
    public void Display(){
        System.out.println(name+" "+sex+" "+age);
        System.out.println("工作经历："+work.getWorkDate()+" "+work.getCompany());
    }
    public Object Clone() throws CloneNotSupportedException {
        Resume obj=new Resume(this.work);
        obj.name=this.name;
        obj.sex=this.sex;
        obj.age=this.age;
        return obj;
    }
}
