package lk.ijse.gdse71.controller;


import lk.ijse.gdse71.dto.UserDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("form")
public class FormURLDataController {

   /*@PostMapping("save")
    public String saveUser(@RequestParam Map<String, String> user) {
       for (Map.Entry<String, String> entry : user.entrySet()) {
           String key = entry.getKey();
           String value = entry.getValue();
           System.out.println("key: " + key + " value: " + value);
       }
       return "success";
   }*/

    @PostMapping("save")
    public String saveUser(@ModelAttribute UserDTO userDTO) {
        System.out.println(userDTO.getUid());
        System.out.println(userDTO.getUname());
        System.out.println(userDTO.getUaddress());

        return "success";

    }

}
