package demo.Gof.Interpreter;

/**
 * Created by 83708 on 2016/5/30.
 */
public class Scale extends Expression {
    @Override
    public void excute(String key, double value) {
        String scale="";
        Double D1=new Double(value);
        switch (D1.intValue()){
            case 1:
                scale="低音";
                break;
            case 2:
                scale="中音";
                break;
            case 3:
                scale="高音";
                break;
        }
        System.out.printf("%s",scale);
    }
}
