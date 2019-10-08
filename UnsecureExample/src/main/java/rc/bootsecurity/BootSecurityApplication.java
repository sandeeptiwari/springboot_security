package rc.bootsecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class BootSecurityApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(BootSecurityApplication.class, args);
    }
}
