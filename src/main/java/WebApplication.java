import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"config", "controller", "service"})
public class WebApplication {

    public static void main(final String[] args) {
        SpringApplication.run(WebApplication.class, args);
    }
}
