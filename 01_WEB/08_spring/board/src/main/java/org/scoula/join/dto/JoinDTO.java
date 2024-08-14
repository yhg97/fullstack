package org.scoula.join.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.scoula.board.domain.BoardVO;
import org.scoula.board.dto.BoardDTO;
import org.scoula.join.domain.JoinVO;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class JoinDTO {
    private Long id;
    private String password;
    private String email;
    private String name;
    private String birth;
    private String phone;
    private String gender;

    public static JoinDTO of(JoinVO vo) {
        return vo == null ? null : JoinDTO.builder()
                .id(vo.getId())
                .password(vo.getPassword())
                .email(vo.getEmail())
                .name(vo.getName())
                .birth(vo.getBirth())
                .phone(vo.getPhone())
                .gender(vo.getGender())
                .build();
    }

    public JoinVO toVo() {
        return JoinVO.builder()
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
