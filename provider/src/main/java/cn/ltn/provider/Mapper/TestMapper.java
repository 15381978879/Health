package cn.ltn.provider.Mapper;

import cn.ltn.service.bean.Testing;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("testMapper")
@Mapper
public interface TestMapper {
    List<Testing> selectTest();
}
