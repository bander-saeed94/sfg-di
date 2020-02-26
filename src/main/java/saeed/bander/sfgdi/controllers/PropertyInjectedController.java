package saeed.bander.sfgdi.controllers;

import saeed.bander.sfgdi.services.GreetingService;

public class PropertyInjectedController {

    public GreetingService greetingService;

    public String getGreeting(){
       return greetingService.sayGreeting();
    }
}
