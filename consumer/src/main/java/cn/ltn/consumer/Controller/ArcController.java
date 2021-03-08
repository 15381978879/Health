package cn.ltn.consumer.Controller;

import cn.ltn.service.bean.Arcs;
import cn.ltn.service.bean.Users;
import cn.ltn.service.service.ArcsService;
import cn.ltn.service.service.TeamsService;
import cn.ltn.service.service.UsersService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static java.lang.Integer.parseInt;

@RestController
public class ArcController {
    @Reference
    ArcsService arcsService;
    @Reference
    UsersService usersService;
    @Reference
    TeamsService teamsService;
    @RequestMapping("SelectAllArcs")
    public List<Arcs> SelectAllArcs(){
        System.out.println(arcsService.SelectAllArcs().toString());
        return null;
    }
    @RequestMapping("SelectArcByUuid")
    public List<Arcs> SelectArcByUuid(@RequestBody String uuid){
        System.out.println(uuid);
        int uuid_int = parseInt(uuid);
        System.out.println(arcsService.SelectArcsByUuid(uuid_int).toString());
        return arcsService.SelectArcsByUuid(uuid_int);
    }
    @RequestMapping("InsertArc")
    public void InsertArc(@RequestBody Arcs arcs){
        int teamid=usersService.SelectTeamid(arcs.getUuid());
        arcs.setTeamid(teamid);
        int areaid=teamsService.SelectAreaid(teamid);
        arcs.setAreaid(areaid);
        System.out.println(arcs.toString());
        arcsService.InsertArcs(arcs);
    }
    @RequestMapping("PersonidValidation")
    public String PersonidValidation(@RequestBody String personid){
        System.out.println(personid);
        List<Arcs> arcsList = arcsService.PersonidValidation(personid);
        if(arcsList.size() == 0){
            System.out.println("yes");
            return "yes";
        }else{
            System.out.println("no");
            return "no";
        }
    }
    @RequestMapping("SelectEachByCapId")
    public List<Arcs> SelectEachByCapId(@RequestBody String uuid){
        System.out.println(uuid);
        System.out.println(arcsService.SelectEachByCapId(parseInt(uuid)));
        return arcsService.SelectEachByCapId(parseInt(uuid));
    }
    @RequestMapping("CapInsertArc")
    public void CapInsertArc(@RequestBody Arcs arcs){
        System.out.println(arcs.toString());
        int teamid=usersService.SelectTeamid(arcs.getUuid());
        arcs.setTeamid(teamid);
        arcs.setAreaid(teamsService.SelectAreaid(teamid));
        arcsService.CapInsertArcs(arcs);
    }
}
