package org.scoula.jdbc_ex.dao;

import org.scoula.jdbc_ex.common.JDBCUtil;
import org.scoula.jdbc_ex.domain.UserVO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserDaoImpl implements UserDao {
    Connection con = JDBCUtil.getConnection();

    //Users 테이블 관련 SQL 명령어
    private String USER_LIST = "select * from users";
    private String USER_GET = "select * from users where id = ?";
    private String USER_INSERT = "insert into users alues(?,?,?,?)";
    private String USER_UPDATE = "update users set name = ? , role = ? where id = ?";
    private String USER_DELETE = "delete from users where id = ?";

    //회원 등록
    @Override
    public int create(UserVO user) throws SQLException{
        try(PreparedStatement ps = con.prepareStatement(USER_INSERT)){
            ps.setString(1, user.getId());
            ps.setString(2, user.getPassword());
            ps.setString(3, user.getName());
            ps.setString(4, user.getRole());
            return ps.executeUpdate();
        }
    }
    private UserVO map(ResultSet rs) throws SQLException {
        UserVO user = new UserVO();
        user.setId(rs.getString("id"));
        user.setPassword(rs.getString("password"));
        user.setName(rs.getString("name"));
        user.setRole(rs.getString("role"));
        return user;
    }

    //회원 목록 조회

    @Override
    public List<UserVO> getList() throws SQLException{
        List<UserVO> userlist = new ArrayList<>();
        Connection con = JDBCUtil.getConnection();
        try(PreparedStatement ps = con.prepareStatement(USER_LIST)){
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                UserVO user = map(rs);
                userlist.add(user);
            }
        }
        return  userlist;
    }

    @Override
    public Optional<UserVO> get(String id) throws SQLException{
        try(PreparedStatement ps = con.prepareStatement(USER_INSERT)){
            ps.setString(1, id);
            try(ResultSet rs = ps.executeQuery()){
                if(rs.next()){
                    return Optional.of(map(rs));
                }
            }
        }
        return Optional.empty();
    }
    //회원 수정
    @Override
    public  int update(UserVO user) throws SQLException{
        Connection conn = JDBCUtil.getConnection();
        try(PreparedStatement ps = conn.prepareStatement(USER_UPDATE)){
            ps.setString(1, user.getName());
            ps.setString(2, user.getRole());
            ps.setString(3, user.getId());
            return ps.executeUpdate();
        }
    }

    //USERS 테이블 관련 CRUD 메소드
    //회원 삭제
    @Override
    public  int delete(String id) throws SQLException{
        try(PreparedStatement ps = con.prepareStatement(USER_DELETE)){
            ps.setString(1, id);
            return ps.executeUpdate();
        }
    }
}
