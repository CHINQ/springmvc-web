package tree.java.Gof.TemplatePattern;

/**
 * Created by 83708 on 2016/3/9.
 */
public class Client {
    public static void main(String[]args){
        System.out.println("甲试卷");
        TestPaperA A=new TestPaperA();
        A.TestQuestion1("a");
        A.TestQuestion2("a");
        A.TestQuestion3("a");
        System.out.println("乙试卷");
        TestPaperB B=new TestPaperB();
        B.TestQuestion1("b");
        B.TestQuestion2("b");
        B.TestQuestion3("c");
    }
}
