package film.comment.carrot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class fcontroller {
    @RequestMapping("/index")
    public String lll(){
        return "index";
    }


}
