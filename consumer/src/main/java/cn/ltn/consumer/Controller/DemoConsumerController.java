package cn.ltn.consumer.Controller;

import cn.ltn.service.service.DefaultApiService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoConsumerController {
    @Reference
    private DefaultApiService demoService;
    @RequestMapping("/sayHello")
    public String sayHello(@RequestParam String name) {
        return demoService.defaultMethod(name);
    }
}
