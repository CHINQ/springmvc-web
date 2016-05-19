package demo.Gof.Adapter;

/**
 * Created by 83708 on 2016/5/19.
 */
public class Translator extends Player {
    private ForeignCenter ws=new ForeignCenter();
    public Translator(String name){
        super(name);
        ws.setName(name);
    }
    public void Attach(){
        ws.FAttach();
    }
    public void Defense(){
        ws.FDefense();
    }
}
