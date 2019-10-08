package rc.bootsecurity.controller.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController {

    @GetMapping("/user")
    public String getUser() {
        return "Sandeep Tiwari";
    }
}
