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
}
