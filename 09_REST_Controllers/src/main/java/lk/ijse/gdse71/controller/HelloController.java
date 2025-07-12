package lk.ijse.gdse71.controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("hello")
public class HelloController {

    // handler mapping
    @GetMapping
    public String getMapping() {
        return "GET";
    }

    @PostMapping
    public String postMapping() {
        return "POST";
    }

    @PutMapping
    public String putMapping() {
        return "PUT";
    }

    @DeleteMapping
    public String deleteMapping() {
        return "DELETE";
    }

    @PatchMapping
    public String patchMapping() {
        return "PATCH";
    }


    // get mapping 2k awoth  - unique path ekak denna
    @GetMapping(path = "get2")
    public String getMapping2() {
        return "GET-2";
    }
}
