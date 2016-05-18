package demo.Gof.AbstractFactory;

/**
 * Created by 83708 on 2016/5/18.
 */
public class SqlserverUser implements IUser{
    public void insert(User user){
        System.out.println("在SQLserver中给User表增加一条记录");
    }
    public User getUser(int id){
        System.out.println("在SQLserver中根据ID的到User表中的一条记录");
        return null;
    }
}
