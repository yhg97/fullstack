package org.scoula.join.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class JoinVO {

        private Long id;
        private String password;
        private String email;
        private String name;
        private String birth;
        private String phone;
        private String gender;

}
