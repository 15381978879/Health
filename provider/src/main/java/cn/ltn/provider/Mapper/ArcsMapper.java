package cn.ltn.provider.Mapper;

import cn.ltn.service.bean.Arcs;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("arcsMapper")
@Mapper
public interface ArcsMapper {
    List<Arcs> SelectAllArcs();
    List<Arcs> SelectArcsByUuid(int uuid);
    List<Arcs> PersonidValidation(String personid);
    void InsertArcs(Arcs arcs);
    List<Arcs> SelectEachByCapId(int uuid);
    void CapInsertArcs(Arcs arcs);
}
