package top.cheivin.grpcdemo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import top.cheivin.grpc.starter.annotation.EnableScanGrpcService;

@SpringBootApplication
// EnableScanGrpcService 注解开启grpc服务配置
@EnableScanGrpcService
public class GrpcDemo1Application {

    public static void main(String[] args) {
        SpringApplication.run(GrpcDemo1Application.class, args);
    }

}
