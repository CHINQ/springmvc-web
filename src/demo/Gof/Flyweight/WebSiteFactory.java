package demo.Gof.Flyweight;

import java.util.HashMap;

/**
 * Created by 83708 on 2016/5/30.
 */
public class WebSiteFactory
{
    private HashMap flyweights=new HashMap();
    public WebSite GetWebSiteCategory(String key){
        if(!flyweights.containsKey(key)){
            flyweights.put(key,new ConcreteWebSite(key));
        }
        return (WebSite)flyweights.get(key);
    }
    public int GetWebSiteCount(){
        return flyweights.size();
    }
}
