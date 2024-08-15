package org.scoula.user.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;
import org.scoula.user.domain.UserVO;
import org.scoula.user.dto.UserDTO;
import org.scoula.user.mapper.UserMapper;
import org.springframework.stereotype.Service;

@Log4j
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    final private UserMapper mapper;

    @Override
    public UserDTO create(UserDTO user) {
        log.info("create......" + user);
        UserVO userVO = user.toVo();
        mapper.create(userVO);



        return UserDTO.of(userVO);
    }
}
