package demo.Gof.Flyweight;

/**
 * Created by 83708 on 2016/5/30.
 */
public class User {
    private String name;
    public User(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
