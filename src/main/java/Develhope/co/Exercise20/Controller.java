package Develhope.co.Exercise20;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {
    @GetMapping("/sum")
    public String sum(@RequestParam int a, @RequestParam int b) {
        Integer sum = a+b;
        return sum.toString();
    }
}
