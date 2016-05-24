package demo.Gof.Bridge;

/**
 * Created by 83708 on 2016/5/24.
 */
public abstract class HandsetBrand {
    protected HandsetSoft soft;
    public void SetHandsetSoft(HandsetSoft soft){
        this.soft=soft;
    }
    public abstract void Run();
}
