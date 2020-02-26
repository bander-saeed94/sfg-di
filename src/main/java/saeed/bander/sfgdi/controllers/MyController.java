package saeed.bander.sfgdi.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String sayHey() {
        System.out.println("Hello world! x");
        return "Hey Folks! x";
    }
}
