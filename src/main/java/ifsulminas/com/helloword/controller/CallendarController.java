package ifsulminas.com.helloword.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;


@RestController
public class CallendarController {


    @GetMapping("calendar/today")
    public Date today(){
        Date d = new Date();
        return d.getDate();
    }

    @GetMapping("calendar/tomorrow")
    public Date tomorrow(){
        Date a = new Date();
        a.setDate(a.getDate() + 10);
        return a;
    }


}
