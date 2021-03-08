package cn.ltn.provider.Mapper;

import cn.ltn.service.bean.Teams;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("teamsMapper")
@Mapper
public interface TeamsMapper {
    List<Teams> SelectAllTeams();
    void InsertTeam(Teams teams);
    int SelectAreaid(int teamid);

}
