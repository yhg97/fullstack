package org.scoula.user.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserVO {

        private String id;
        private String password;
        private String email;
        private String name;
        private String birth;
        private String phone;
        private String gender;

}
