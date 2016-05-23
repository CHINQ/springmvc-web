package demo.Gof.Memento;

/**
 * Created by 83708 on 2016/5/19.
 */
public class Main {
    public static void main(String[]args){
        GameRole l=new GameRole();
        l.GetInitState();
        l.StateDisPlay();
        RoleStateCaretaker state=new RoleStateCaretaker();
        state.setMemento(l.SaveState());
        l.Fight();
        l.StateDisPlay();
        l.RecoveryState(state.getMemento());
        l.StateDisPlay();
    }
}
