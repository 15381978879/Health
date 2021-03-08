package cn.ltn.provider.Mapper;

import cn.ltn.service.bean.Areas;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("areasMapper")
@Mapper
public interface AreasMapper {
    List<Areas> SelectAllAreas();
}
