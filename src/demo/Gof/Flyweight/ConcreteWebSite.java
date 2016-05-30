package demo.Gof.Flyweight;

/**
 * Created by 83708 on 2016/5/30.
 */
public class ConcreteWebSite extends WebSite {
    private String name="";
    public ConcreteWebSite(String name){
        this.name=name;
    }

    @Override
    public void Use(User user) {
        System.out.println("网站分类："+name+" 用户："+user.getName());
    }
}
