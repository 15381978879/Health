package cn.ltn.service.service;

import cn.ltn.service.bean.Teams;

import java.util.List;

public interface TeamsService {
    List<Teams> SelectAllTeams();
    void InsertTeam(Teams teams);
    int SelectAreaid(int teamid);
}
