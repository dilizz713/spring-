package lk.ijse.gdse71.controller;

import lk.ijse.gdse71.dto.UserDTO;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("json")
public class JSONController {

    @PostMapping(value = "save" , consumes = MediaType.APPLICATION_JSON_VALUE)
    public String postJson(@RequestBody UserDTO userDTO) {
        System.out.println(userDTO);

        return "success";
    }

    @GetMapping
    public String getJson() {

    }
}
