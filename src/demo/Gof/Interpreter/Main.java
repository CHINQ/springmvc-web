package demo.Gof.Interpreter;

/**
 * Created by 83708 on 2016/5/30.
 */
public class Main {
    public static void main(String[]args){
        PlayContext p=new PlayContext();
        p.setText("O 2 E 0.5 G 0.5 A 3 E 0.5");
        Expression expression=null;
        try {
            while (p.getText().length()>0) {
                String str=p.getText().substring(0,1);
                switch (str){
                    case "O":
                        expression=new Scale();
                        break;
                    case "C":
                    case "D":
                    case "E":
                    case "F":
                    case "G":
                    case "A":
                    case "B":
                    case "P":
                        expression=new Note();
                        break;
                }
                expression.Interpret(p);
            }
        }catch(Exception ex){
            System.out.println(ex.toString());
        }
    }
}
