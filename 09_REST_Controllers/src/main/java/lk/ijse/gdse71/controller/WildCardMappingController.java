package lk.ijse.gdse71.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("wild")
public class WildCardMappingController {

    @GetMapping("*")
    public String hello() {
        return "Hello World";
    }

    @GetMapping("*/one")
    public String hello2() {
        return "Hello2";
    }

    @GetMapping("hello/*/*")
    public String hello3() {
        return "Hello3";
    }
}
