package demo.Gof.Prototype;

/**
 * Created by 83708 on 2016/3/8.
 */
public class Client {
    public static void main(String[]args){
        Resume a=new Resume("大鸟");
        a .SetPersonalInfo("男","23");
        a.SetWorkExperience("2014-2016","咖啡师");

        Resume b= null;
        try {
            b = (Resume)a.Clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        b.SetWorkExperience("2012-2016","煮酒师");

        a.Display();
        b.Display();
    }
}
