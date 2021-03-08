package cn.ltn.provider.Impl;

import cn.ltn.provider.Mapper.TeamsMapper;
import cn.ltn.service.bean.Teams;
import cn.ltn.service.service.TeamsService;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Service
@Component
public class TeamsServiceImpl implements TeamsService {
    @Autowired
    TeamsMapper teamsMapper;
    @Override
    public List<Teams> SelectAllTeams() {
        return teamsMapper.SelectAllTeams();
    }

    @Override
    public void InsertTeam(Teams teams) {
        teamsMapper.InsertTeam(teams);
    }

    @Override
    public int SelectAreaid(int teamid) {
        return teamsMapper.SelectAreaid(teamid);
    }
}
