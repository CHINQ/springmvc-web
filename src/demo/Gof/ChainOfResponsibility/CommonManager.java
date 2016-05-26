package demo.Gof.ChainOfResponsibility;

/**
 * Created by 83708 on 2016/5/26.
 */
public class CommonManager extends Manager {
    public CommonManager(String name){
        super(name);
    }

    @Override
    public void RequestApplications(Request request) {
        if(request.getRequestType().equals("请假")&&request.getNumber()<2){
            System.out.printf("%s:%s数量%s被批准",name,request.getRequestContent(),request.getNumber());
        }else{
            if(superior!=null){
                superior.RequestApplications(request);
            }
        }
    }
}
