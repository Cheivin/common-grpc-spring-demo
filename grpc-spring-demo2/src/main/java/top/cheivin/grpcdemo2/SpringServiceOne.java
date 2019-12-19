package top.cheivin.grpcdemo2;

import org.springframework.stereotype.Component;
import top.cheivin.grpc.annotation.GrpcService;

/**
 * 此接口无实现类，为远程服务调用者
 * user:cheivin
 * date:2019/12/19
 */
@GrpcService(service = "SpringServiceOne", version = "1.0.0")
@Component
public interface SpringServiceOne {
    String hello(String name);
}
