package lk.ijse.gdse71.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("param")
public class RequestParamController {

    @GetMapping(params = {"id"})
    public String hello(@RequestParam("id") int Id) {
        return "Hello " + Id;
    }

    @GetMapping(params = {"id" , "name"})
    public String hello1(@RequestParam("id") int Id, @RequestParam("name") String Name) {
        return "Hello " + Id + " " + Name;
    }


    @GetMapping(path = "{code}", params = {"id" , "name"})
    public String hello2(@PathVariable("code") String Code ,  @RequestParam("id") int Id, @RequestParam("name") String Name) {
        return "Hello " + Id + " " + Name + " " + Code;
    }
}
