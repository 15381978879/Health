package cn.ltn.provider.Mapper;

import cn.ltn.service.bean.Users;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("usersMapper")
@Mapper
public interface UsersMapper {
    List<Users> login(String username);
    List<Users> SelectAll();
    List<Users> SelectByName(String nickname);
    void InsertUser(Users users);
    void UpdateUser(Users users);
    List<Users> SelectCap();
    int SelectTeamid(int uuid);
    List<Users> GetTeamer(int uuid);
}
