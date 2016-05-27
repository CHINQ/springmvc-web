package demo.Gof.Mediator;

/**
 * Created by 83708 on 2016/5/27.
 */
public class UniteNationsSecurityCouncil extends UniteNations {
    private USA colleaguel1;
    private Iraq colleaguel2;

    public USA getColleaguel1() {
        return colleaguel1;
    }

    public void setColleaguel1(USA colleaguel1) {
        this.colleaguel1 = colleaguel1;
    }

    public Iraq getColleaguel2() {
        return colleaguel2;
    }

    public void setColleaguel2(Iraq colleaguel2) {
        this.colleaguel2 = colleaguel2;
    }

    @Override
    public void Declare(String message, Country colleague) {
        if(colleague.equals(colleaguel1)){
            colleaguel2.GetMessage(message);
        }else{
            colleaguel1.GetMessage(message);
        }
    }
}
