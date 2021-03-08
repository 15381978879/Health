package cn.ltn.provider.Impl;

import cn.ltn.provider.Mapper.AreasMapper;
import cn.ltn.service.bean.Areas;
import cn.ltn.service.service.AreasService;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Service
@Component
public class AreasServiceImpl implements AreasService {
    @Autowired
    AreasMapper areasMapper;
    @Override
    public List<Areas> SelectAllAreas() {
        return areasMapper.SelectAllAreas();
    }
}
