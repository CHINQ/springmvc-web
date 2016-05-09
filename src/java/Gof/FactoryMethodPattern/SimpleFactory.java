package tree.java.Gof.FactoryMethodPattern;

/**
 * Created by 83708 on 2016/3/8.
 */
public class SimpleFactory {
    public static LeiFeng CreatELeiFeng(String type){
        LeiFeng result=null;
        switch (type){
            case "学雷锋的大学生":
                result=new Undergraduate();
                break;
            case "社区志愿者":
                result=new Volunteer();
                break;
        }
        return result;
    }
}
