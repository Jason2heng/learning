package user.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import user.entity.UserEntity;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserDao {
    List<UserEntity> getAll(@Param("content") Map map);
    //lalalala
    



}
