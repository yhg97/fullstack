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
        log.info("Creating user: " + user);

        // ID 중복 확인
        // ID 중복 확인
        if (mapper.existsById(user.getId())) {
            throw new IllegalArgumentException("ID already exists: " + user.getId());
        }

        // UserDTO를 UserVO로 변환
        UserVO userVO = user.toVo();

        // 사용자 생성
        mapper.create(userVO);

        // 결과를 UserDTO로 반환
        return UserDTO.of(userVO);
    }
}
