package cn.ltn.provider.Mapper;

import cn.ltn.service.bean.Users;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("usersMapper")
@Mapper
public interface UsersMapper {
    List<Users> login(String username);
}
