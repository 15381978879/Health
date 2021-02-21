package cn.ltn.service.service;

import cn.ltn.service.bean.Users;

import java.util.List;

public interface UsersService {
    List<Users> login(String username);
}
