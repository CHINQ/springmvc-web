package demo.Gof.Flyweight;

/**
 * Created by 83708 on 2016/5/30.
 */
public class Main {
    public static void main(String[]args){
        WebSiteFactory wf=new WebSiteFactory();
        WebSite w=wf.GetWebSiteCategory("产品展示");
        w.Use(new User("A"));
    }
}
