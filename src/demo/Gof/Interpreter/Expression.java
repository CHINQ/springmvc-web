package demo.Gof.Interpreter;

/**
 * Created by 83708 on 2016/5/30.
 */
public abstract class Expression {
    public void Interpret(PlayContext context){
        if(context.getText().length()==0){
            return;
        }else{
            String playKey=context.getText().substring(0,1);
            context.setText(context.getText().substring(2));
            double playValue=Double.valueOf(context.getText().substring(0,context.getText().indexOf(" ")));
            context.setText(context.getText().substring(context.getText().indexOf(" ")+1));
            excute(playKey,playValue);
        }
    }
    public abstract void excute(String key,double value);
}
