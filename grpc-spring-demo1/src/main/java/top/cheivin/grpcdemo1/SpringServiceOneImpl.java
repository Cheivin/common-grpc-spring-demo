package top.cheivin.grpcdemo1;

import org.springframework.stereotype.Service;

/**
 * 服务实现
 * user:cheivin
 * date:2019/12/19
 */
@Service
public class SpringServiceOneImpl implements SpringServiceOne {
    @Override
    public String hello(String name) {
        return "hello~ " + name + ", from: " + GrpcDemo1Application.class.getName();
    }
}
