package lk.ijse.gdse71.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("path")
public class PathVariableController {
    @GetMapping(path = "{id}")
    public String hello(@PathVariable("id") String Id) {
        return "Id " + Id;
    }

    @GetMapping(path = "{name}/{age}")
    public String hello1(@PathVariable("name") String Name, @PathVariable("age") int Age) {
        return  Name + " "+ Age;
    }

    @GetMapping(path = "customer/{id:[I][0-9]{3}}")                  //REGEX
    public String hello2(@PathVariable("id") String Id) {
        return "Hello " + Id;
    }

    @GetMapping(path = "item/{code}/branch/{city}")
    public String hello3(@PathVariable("code") String Code, @PathVariable("city") String City) {
        return Code + " : " + City;
    }

    @GetMapping(path = "items/{code:[I][0-9]{3}}/branch/{city}")
    public String hello4(@PathVariable("code") String Code, @PathVariable("city") String City) {
        return Code + " : " + City;
    }





}
