package org.scoula.user.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.scoula.user.domain.UserVO;

@Mapper
public interface UserMapper {
    
    public void create(UserVO user);

    boolean existsById(String id);
}
