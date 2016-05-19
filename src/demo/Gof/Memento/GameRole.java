package demo.Gof.Memento;

/**
 * Created by 83708 on 2016/5/19.
 */
public class GameRole
{
    private int vit;
    private int atk;
    private int def;

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public void stateDisPlay(){
        System.out.println("角色当前状态：");
        System.out.printf("体力%s",this.vit);
        System.out.printf("攻击力%s",this.atk);
        System.out.printf("防御力%s",this.def);
    }
    public void GetInitState(){
        this.vit=100;
        this.atk=100;
        this.def=100;
    }
    public void Fight(){
        this.vit=0;
        this.atk=0;
        this.def=0;
    }
}
