package demo.Gof.AbstractFactory;

/**
 * Created by 83708 on 2016/5/18.
 */
public class Main {
    public static void main(String[]args){
        User user=new User();
//        IFactory factory=new SqlserverFactory();
        IUser iu=DataAccess.createUser();
        iu.insert(user);
        iu.getUser(1);
    }
}
