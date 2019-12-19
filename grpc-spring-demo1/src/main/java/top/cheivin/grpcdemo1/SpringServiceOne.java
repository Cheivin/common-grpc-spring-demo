package top.cheivin.grpcdemo1;

import top.cheivin.grpc.annotation.GrpcService;

/**
 * 此接口有实现类，为服务的提供者
 * user:cheivin
 * date:2019/12/19
 */
@GrpcService(service = "SpringServiceOne", version = "1.0.0")
public interface SpringServiceOne {
    String hello(String name);
}
