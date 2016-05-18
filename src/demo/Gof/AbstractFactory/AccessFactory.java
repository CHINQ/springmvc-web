package demo.Gof.AbstractFactory;

/**
 * Created by 83708 on 2016/5/18.
 */
public class AccessFactory implements IFactory {
    public IUser createUser() {
        return new AccessUser();
    }
}
