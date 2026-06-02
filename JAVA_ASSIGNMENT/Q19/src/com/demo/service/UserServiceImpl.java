package com.demo.service;




import com.demo.dao.UserDao;
import com.demo.dao.UserDaoImpl;
import com.demo.model.User;

public class UserServiceImpl
        implements UserService {

    UserDao dao = new UserDaoImpl();

    public User searchUser(
            String username,
            String address) {

        return dao.searchUser(
                username, address);
    }

    public void addUser(User user) {
        dao.addUser(user);
    }
}