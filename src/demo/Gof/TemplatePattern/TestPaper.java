package demo.Gof.TemplatePattern;

/**
 * Created by 83708 on 2016/3/9.
 */
public class TestPaper {
    //试题1
    public void Question1(String ans){
        System.out.println("问题1");
        System.out.println(Answerl(ans));
    }
    //试题2
    public void Question2(String ans){
        System.out.println("问题2");
        System.out.println(Answerl(ans));
    }
    //试题3
    public void Question3(String ans){
        System.out.println("问题3");
        System.out.println(Answerl(ans));
    }
    public String Answerl(String ans){
        return ans;
    }
}
