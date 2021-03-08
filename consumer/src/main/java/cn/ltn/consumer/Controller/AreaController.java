package cn.ltn.consumer.Controller;

import cn.ltn.service.bean.Areas;
import cn.ltn.service.service.AreasService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AreaController {
    @Reference
    private AreasService areasService;
    @RequestMapping("/SelectAllAreas")
    public List<Areas> SelectAllAreas(){
        return areasService.SelectAllAreas();
    }
}
