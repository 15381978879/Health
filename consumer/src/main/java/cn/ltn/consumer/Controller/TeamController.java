package cn.ltn.consumer.Controller;

import cn.ltn.service.bean.Teams;
import cn.ltn.service.service.TeamsService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TeamController {
    @Reference
    private TeamsService teamsService;
    @RequestMapping("SelectAllTeams")
    public List<Teams> SelectAllTeams(){
        System.out.println(teamsService.SelectAllTeams().toString());
        return teamsService.SelectAllTeams();
    }
    @RequestMapping("InsertTeam")
    public void InsertTeam(@RequestBody Teams teams){
        System.out.println(teams.toString());
        teamsService.InsertTeam(teams);
    }
}
