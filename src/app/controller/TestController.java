package app.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
/**
 * Created by 83708 on 2016/4/15.
 */
@Controller
public class TestController {
    @Autowired
    @RequestMapping("/index.do")
    public ModelAndView index(){
        return new ModelAndView("/login");
    }
}