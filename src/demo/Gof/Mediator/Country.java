package demo.Gof.Mediator;

/**
 * Created by 83708 on 2016/5/27.
 */
public abstract class Country {
    protected UniteNations mediator;
    public Country(UniteNations mediator){
        this.mediator=mediator;
    }
}
