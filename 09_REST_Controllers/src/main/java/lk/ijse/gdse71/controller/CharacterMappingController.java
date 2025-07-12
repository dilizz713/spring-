package lk.ijse.gdse71.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("char")
public class CharacterMappingController {

    //      http://localhost:8080/09_REST_Controllers_Web_exploded/char/item/I???     - give suitable characters for ???
    @GetMapping("item/I???")
    public String sayHello() {
        return "sayHello";
    }

    //      http://localhost:8080/09_REST_Controllers_Web_exploded/char/????/search  - give suitable characters for ????
    @GetMapping("????/search")
    public String sayHello2() {
        return "sayHello2";
    }
}
