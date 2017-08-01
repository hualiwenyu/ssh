package com.stephen.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author: Stephen(武海昊)
 * @Date: 17/7/28.
 */
@Entity
@Table(name = "t_user")
public class User {


    @Id
    @Column(name = "id")
    private long id;

    private String user_name;

    private String user_phone;
    private String user_email;
    private String user_pwd;

    private String pwd_salt;

    private Date create_time;
    private Date modify_time;

    private int is_delete;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_phone() {
        return user_phone;
    }

    public void setUser_phone(String user_phone) {
        this.user_phone = user_phone;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public String getUser_pwd() {
        return user_pwd;
    }

    public void setUser_pwd(String user_pwd) {
        this.user_pwd = user_pwd;
    }

    public String getPwd_salt() {
        return pwd_salt;
    }

    public void setPwd_salt(String pwd_salt) {
        this.pwd_salt = pwd_salt;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Date getModify_time() {
        return modify_time;
    }

    public void setModify_time(Date modify_time) {
        this.modify_time = modify_time;
    }

    public int getIs_delete() {
        return is_delete;
    }

    public void setIs_delete(int is_delete) {
        this.is_delete = is_delete;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", user_name='" + user_name + '\'' +
                ", user_phone='" + user_phone + '\'' +
                ", user_email='" + user_email + '\'' +
                ", user_pwd='" + user_pwd + '\'' +
                ", pwd_salt='" + pwd_salt + '\'' +
                ", create_time=" + create_time +
                ", modify_time=" + modify_time +
                ", is_delete=" + is_delete +
                '}';
    }
}
