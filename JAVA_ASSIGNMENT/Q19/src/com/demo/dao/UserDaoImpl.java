package com.demo.dao;



import java.sql.*;

import com.demo.model.User;


public class UserDaoImpl implements UserDao {

    @Override
    public User searchUser(String username,
                           String address) {

        String sql =
          "select * from user where username=? and address=?";

        try(Connection con = DBUtil.getConnection();
            PreparedStatement ps =
                    con.prepareStatement(sql)) {

            ps.setString(1, username);
            ps.setString(2, address);

            ResultSet rs = ps.executeQuery();

            if(rs.next()) {

                return new User(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4));
            }

        } catch(Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public void addUser(User user) {

        String sql =
          "insert into user values(?,?,?,?)";

        try(Connection con = DBUtil.getConnection();
            PreparedStatement ps =
                    con.prepareStatement(sql)) {

            ps.setString(1,
                    user.getUsername());
            ps.setString(2,
                    user.getAddress());
            ps.setString(3,
                    user.getMobile());
            ps.setString(4,
                    user.getEmail());

            ps.executeUpdate();

            System.out.println("User Added");

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}