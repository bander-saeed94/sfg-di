package saeed.bander.sfgdi.controllers;

import org.springframework.stereotype.Controller;
import saeed.bander.services.GreetingService;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHey() {
        return greetingService.sayGreeting();
    }
}
