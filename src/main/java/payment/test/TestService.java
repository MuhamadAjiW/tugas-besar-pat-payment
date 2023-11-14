package payment.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestService {
    @GetMapping("/")
    public String hello(){
        return "Payment Server is Running";
    }
}
