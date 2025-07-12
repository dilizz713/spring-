package lk.ijse.gdse71.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class ExtractMappingController {

    //      http://localhost:8080/09_REST_Controllers_Web_exploded/api
    @GetMapping
    public String hello() {
        return "Hello";
    }

    //     /api/hello
    @GetMapping("hello")
    public String hello2() {
        return "Hello2";
    }

    //     /api/hello/three
    @GetMapping("hello/three")
    public String hello3() {
        return "Hello3";
    }

    //     /api/hello/three/four
    @GetMapping("hello/three/four")
    public String hello4() {
        return "Hello4";
    }
}
