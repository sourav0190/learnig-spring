package Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Usercontroller {
    @GetMapping("/")
    public String getdata(){
        return "learning spring";
    }
}
