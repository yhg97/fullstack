package org.scoula.user.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.scoula.user.domain.UserVO;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDTO {
    private String id;
    private String password;
    private String email;
    private String name;
    private String birth;
    private String phone;
    private String gender;

    public static UserDTO of(UserVO vo) {
        return vo == null ? null : UserDTO.builder()
                .id(vo.getId())
                .password(vo.getPassword())
                .email(vo.getEmail())
                .name(vo.getName())
                .birth(vo.getBirth())
                .phone(vo.getPhone())
                .gender(vo.getGender())
                .build();
    }

    public UserVO toVo() {
        return UserVO.builder()
                .id(id)
                .password(password)
                .email(email)
                .name(name)
                .birth(birth)
                .phone(phone)
                .gender(gender)
                .build();
    }
}

