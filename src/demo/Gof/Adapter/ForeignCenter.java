package demo.Gof.Adapter;

/**
 * Created by 83708 on 2016/5/19.
 */
public class ForeignCenter {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void FAttach(){
        System.out.printf("%s前锋进攻",name);
    }
    public void FDefense(){
        System.out.printf("%s前锋防守",name);
    }
}
