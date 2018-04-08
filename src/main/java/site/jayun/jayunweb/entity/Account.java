package site.jayun.jayunweb.entity;

import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "s_user_info")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "UID_", unique = true, nullable = false)
    private long uid;
    @Column(length = 30, nullable = false, unique = true)
    private String account;
    @Column(name = "call_phone", length = 30)
    private String phone;
    @Column(name = "nick_name", length = 30)
    private String nickname;
    @Column(length = 30)
    private String password;
    @Column(length = 30)
    private String updateUser;
    private Date updateTime;
    @Column(length = 30)
    private String createUser;
    private Timestamp createTime;
    private int state;
}