package cn.ltn.service.service;

import cn.ltn.service.bean.Arcs;

import java.util.List;

public interface ArcsService {
    List<Arcs> SelectAllArcs();
    List<Arcs> SelectArcsByUuid(int uuid);
    List<Arcs> PersonidValidation(String personid);
    void InsertArcs(Arcs arcs);
    List<Arcs> SelectEachByCapId(int uuid);
    void CapInsertArcs(Arcs arcs);
}
