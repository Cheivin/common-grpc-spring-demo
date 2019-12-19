package top.cheivin.grpcdemo2;

import org.springframework.stereotype.Service;

/**
 * TODO
 * user:cheivin
 * date:2019/12/19
 */
@Service
public class SpringServiceTwoImpl implements SpringServiceTwo {
    @Override
    public String hi(String name) {
        return "hi~ " + name + ", from: " + GrpcDemo2Application.class.getName();
    }
}
