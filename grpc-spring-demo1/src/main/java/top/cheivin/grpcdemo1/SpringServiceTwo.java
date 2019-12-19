package top.cheivin.grpcdemo1;

import org.springframework.stereotype.Component;
import top.cheivin.grpc.annotation.GrpcService;

/**
 * 此接口无实现类，为远程服务调用者
 * user:cheivin
 * date:2019/12/19
 */
@GrpcService(service = "SpringServiceTwo", version = "1.0.0")
@Component
public interface SpringServiceTwo {
    String hi(String name);
}
