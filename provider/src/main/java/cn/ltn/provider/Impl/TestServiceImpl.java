package cn.ltn.provider.Impl;

import cn.ltn.provider.Mapper.TestMapper;
import cn.ltn.service.bean.Testing;
import cn.ltn.service.service.TestService;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Service
@Component
public class TestServiceImpl implements TestService {

    @Autowired
    TestMapper testMapper;
    @Override
    public List<Testing> selectTest() {
        System.out.println("111");
        return testMapper.selectTest();
    }
}
