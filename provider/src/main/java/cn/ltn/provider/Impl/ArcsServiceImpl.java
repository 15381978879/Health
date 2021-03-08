package cn.ltn.provider.Impl;

import cn.ltn.provider.Mapper.ArcsMapper;
import cn.ltn.service.bean.Arcs;
import cn.ltn.service.service.ArcsService;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Service
@Component
public class ArcsServiceImpl implements ArcsService {
    @Autowired
    ArcsMapper arcsMapper;
    @Override
    public List<Arcs> SelectAllArcs() {
        return arcsMapper.SelectAllArcs();
    }

    @Override
    public List<Arcs> SelectArcsByUuid(int uuid) {
        return arcsMapper.SelectArcsByUuid(uuid);
    }

    @Override
    public List<Arcs> PersonidValidation(String personid) {
        return arcsMapper.PersonidValidation(personid);
    }

    @Override
    public void InsertArcs(Arcs arcs) {
        arcsMapper.InsertArcs(arcs);
    }

    @Override
    public List<Arcs> SelectEachByCapId(int uuid) {
        return arcsMapper.SelectEachByCapId(uuid);
    }

    @Override
    public void CapInsertArcs(Arcs arcs) {
        arcsMapper.CapInsertArcs(arcs);
    }

}
