package demo.Gof.Adapter;

/**
 * Created by 83708 on 2016/5/19.
 */
public class Main {
    public static  void main(String[]args){
        Player a=new Forwards("ALI");
        a.Attach();
        Player b=new Translator("BIBI");
        b.Defense();
    }
}
