package rc.bootsecurity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import rc.bootsecurity.model.User;
import rc.bootsecurity.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class DbInit implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public void run(String... args) throws Exception {
        userRepository.deleteAll();

        User sandi = new User("sandi", passwordEncoder.encode("sandi123"), 1, "USER", "");
        User admin = new User("admin", passwordEncoder.encode("admin123"), 1, "ADMIN", "ACCESS_REST");
        User manager = new User("manager", passwordEncoder.encode("manager123"), 1, "MANAGER", "ACCESS_REST");

        List<User> users = new ArrayList<>();
        users.add(sandi);
        users.add(admin);
        users.add(manager);

        userRepository.saveAll(users);
    }
}
