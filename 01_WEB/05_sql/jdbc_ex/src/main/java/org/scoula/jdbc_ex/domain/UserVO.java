package org.scoula.jdbc_ex.domain;

public class UserVO {
    private String id;
    private String password;
    private String name;
    private String role;
    //@NoArgsConstructor가 만들어주는 생성자
    public UserVO() {
    }
    //@AllArgsConstuctor가 만들어주는 생성자
    public UserVO(String id, String password, String name, String role) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.role = role;
    }
    //@Getter, @Setter 밑으로 모두
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
}
