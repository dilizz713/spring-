package lk.ijse.gdse71.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*@RestController*/
@Controller
@RequestMapping("hello")
public class HelloController {
    public HelloController() {
        System.out.println("HelloController");
    }

    @GetMapping("index")                // url eke agata hello/index
    public String hello() {
        /*return "Hello Spring";*/
        return "index";                     //  /view/index.html

    }

    @GetMapping("customer")         // url eke agata hello/customer
    public String hello2() {
        return "customer";
    }

   /* @GetMapping("one")
    public String test1() {
        return "Test 1 Method";
    }

    @GetMapping("two")
    public String test2() {
        return "Test 2 Method";
    }*/
}
