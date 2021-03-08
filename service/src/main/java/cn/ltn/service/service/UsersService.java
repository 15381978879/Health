package cn.ltn.service.service;

import cn.ltn.service.bean.Users;

import java.util.List;

public interface UsersService {
    List<Users> login(String username);
    List<Users> SelectAll();
    List<Users> SelectByName(String nickname);
    void InsertUser(Users users);
    void UpdateUser(Users users);
    List<Users> SelectCap();
    int SelectTeamid(int uuid);
    List<Users> GetTeamer(int uuid);
}
