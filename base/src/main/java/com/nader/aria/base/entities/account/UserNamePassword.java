package com.nader.aria.base.entities.account;

import com.nader.aria.base.entities.abstracts.BaseEntityImpl;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="USER_NAME_PASSWORDS" , uniqueConstraints = @UniqueConstraint(columnNames= {"USER_NAME"}) )
public class UserNamePassword extends BaseEntityImpl {

    private static final long serialVersionUID = 1L;

    @Column(name="USER_NAME")
    private String userName;

    @Column(name="PASSWORD")
    private String password;

    public String getUserName() { return userName; }
    public void setUserName(String userName) { this.userName = userName; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

}
