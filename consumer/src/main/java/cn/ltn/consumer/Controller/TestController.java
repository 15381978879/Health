package cn.ltn.consumer.Controller;

import cn.ltn.service.bean.Users;
import cn.ltn.service.service.TestService;
import cn.ltn.service.service.UsersService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.apache.catalina.User;
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
        }else if(new Integer(usersList.get(0).getStatus()) == 0){
            System.out.println("the account is not available");
            return "3";
        } else if(usersList.get(0).getPassword().equals(password)){
            if(usersList.get(0).getRoleid()==1){
                return "2";
            }else if (usersList.get(0).getRoleid()==2){
                return usersList.get(0).getUuid()+"4";
            }else if (usersList.get(0).getRoleid()==3){
                return usersList.get(0).getUuid()+"5";
            }else{
                return "error";
            }
        }else{
            System.out.println("password is wrong");
            return "3";
        }

    }
    @RequestMapping("SelectAllUser")
    public List<Users> SelectAllUser(){
        System.out.println(usersService.SelectAll().toString());
        return usersService.SelectAll();
    }
    @RequestMapping("SelectByName")
    public List<Users> SelectByName(@RequestBody Users users){
        System.out.println(usersService.SelectByName(users.getNickname()).toString());
        return usersService.SelectByName(users.getNickname());
    }
    @RequestMapping("InsertUser")
    public void InsertUser(@RequestBody Users users){
        usersService.InsertUser(users);
    }
    @RequestMapping("UpdateUser")
    public void UpdateUser(@RequestBody Users users){
        usersService.UpdateUser(users);
    }
    @RequestMapping("SelectCap")
    public List<Users> SelectCap(){
        return usersService.SelectCap();
    }

    @RequestMapping("GetTeamer")
    public List<Users> GetTeamer(@RequestBody int uuid){
        return usersService.GetTeamer(uuid);
    }
}
