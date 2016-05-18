package demo.Gof.Decorator;

/**
 * Created by 83708 on 2016/3/7.
 */
public class Person {
    public Person(){}
    private String name;
    public Person(String name){
        this.name=name;
    }

    public void Show(){
        System.out.println("装扮的"+name);
    }
}
