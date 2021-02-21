package cn.ltn.provider;

import cn.ltn.provider.Mapper.TestMapper;
import cn.ltn.service.bean.Testing;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@EnableDubbo
@SpringBootTest
public class ProviderApplicationTests {


    @Autowired
    private TestMapper testMapper;


    @Test
    public void contextLoads() {

        List<Testing> list = testMapper.selectTest();
        list.forEach(item->{
            System.out.println(item);
        });
    }

}
