package top.cheivin.grpcdemo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 * user:cheivin
 * date:2019/12/19
 */
@RestController
public class Controller {
    @Autowired
    private SpringServiceOne springServiceOne;
    @Autowired
    private SpringServiceTwo springServiceTwo;

    @GetMapping("/hello")
    public String hello() {
        return springServiceOne.hello("cheivin1");
    }

    @GetMapping("/hi")
    public String hi() {
        return springServiceTwo.hi("cheivin1");
    }
}
