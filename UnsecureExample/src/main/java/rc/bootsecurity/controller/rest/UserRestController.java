package rc.bootsecurity.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import rc.bootsecurity.model.User;
import rc.bootsecurity.repository.UserRepository;

import java.util.List;

@RestController
public class UserRestController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/api/user")
    public String getUser() {
        return "Sandeep Tiwari";
    }

    @GetMapping("/api/user/get_users")
    public List<User> getUsers() {
        return userRepository.findAll();
    }
}
