package cn.ltn.provider.Impl;

import cn.ltn.provider.Mapper.UsersMapper;
import cn.ltn.service.bean.Users;
import cn.ltn.service.service.UsersService;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Service
@Component
public class UsersServiceImpl implements UsersService {

    @Autowired
    UsersMapper usersMapper;
    @Override
    public List<Users> login(String username) {
        System.out.println("This is UsersServiceImpl");
        return usersMapper.login(username);
    }

    @Override
    public List<Users> SelectAll() {
        return usersMapper.SelectAll();
    }

    @Override
    public List<Users> SelectByName(String nickname) {
        return usersMapper.SelectByName(nickname);
    }

    @Override
    public void InsertUser(Users users) {
         usersMapper.InsertUser(users);
    }

    @Override
    public void UpdateUser(Users users) {
        usersMapper.UpdateUser(users);
    }

    @Override
    public List<Users> SelectCap() {
        return usersMapper.SelectCap();
    }

    @Override
    public int SelectTeamid(int uuid) {
        return usersMapper.SelectTeamid(uuid);
    }

    @Override
    public List<Users> GetTeamer(int uuid) {
        return usersMapper.GetTeamer(uuid);
    }
}
