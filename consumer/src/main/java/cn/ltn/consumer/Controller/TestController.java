package cn.ltn.consumer.Controller;

import cn.ltn.service.bean.Users;
import cn.ltn.service.service.TestService;
import cn.ltn.service.service.UsersService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {
    @Reference
    private TestService testService;
    @Reference
    private UsersService usersService;
    @RequestMapping("/hello")
    public String Hello(@RequestBody Users users){
        System.out.println(users.getUsername());
        System.out.println(users.getPassword());
        String username=users.getUsername();
        String password=users.getPassword();
        System.out.println(usersService.login(username).size());
        List<Users> usersList = usersService.login(username);
        if(usersList.isEmpty()){
            System.out.println("the account is not exited");
            return "1";
        }else if(usersList.get(0).getPassword().equals(password)){
            System.out.println("ok");
            return "2";
        }else{
            System.out.println("password is wrong");
            return "3";
        }

    }

}
