package com.stephen.dao;

import com.stephen.model.User;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: Stephen(武海昊)
 * @Date: 17/7/28.
 */
@Repository
public class UserDao {

    @Autowired
    private SessionFactory sessionFactory;

    public User login(String userName, String password) {
        String hql = "from User u where u.user_name = '"+userName+"' and u.user_pwd = '"+password+"'";
        Session session = sessionFactory.openSession();
        Query query = session.createQuery(hql);
        List<User> users = query.list();
        if (users!= null && users.size() > 0) {
            return users.get(0);
        }
        return null;
    }

}
