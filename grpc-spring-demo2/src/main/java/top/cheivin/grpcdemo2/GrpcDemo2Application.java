package top.cheivin.grpcdemo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import top.cheivin.grpc.starter.annotation.EnableScanGrpcService;

@SpringBootApplication
// EnableScanGrpcService 注解开启grpc服务配置
@EnableScanGrpcService
public class GrpcDemo2Application {

    public static void main(String[] args) {
        SpringApplication.run(GrpcDemo2Application.class, args);
    }

}
