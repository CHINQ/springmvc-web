package demo.Gof.AbstractFactory;
/**
 * Created by 83708 on 2016/5/18.
 */
public class DataAccess {
    private static final String db="Sqlserver";
//    private static final String db="Access";
    public static IUser createUser(){
        IUser result=null;
        String className=db+"User";
        try {
            Class c = Class.forName("demo.Gof.AbstractFactory."+className);
            Object o = c.newInstance();
            result=(IUser)o;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
//    public static IUser createUser(){
//        IUser result=null;
//        switch(db){
//            case "Sqlserver":
//                result=new SqlserverUser();
//                break;
//            case "Sccess":
//                result=new AccessUser();
//                break;
//        }
//        return result;
//    }
}
