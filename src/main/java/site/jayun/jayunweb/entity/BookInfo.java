package site.jayun.jayunweb.entity;

import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Data
@Entity
@Table(name = "s_book_info")
public class BookInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long uid;
    @Column(length = 10, unique = true, nullable = false)
    private String bookNo;
    @Column(length = 30, nullable = false)
    private String shortName;
    @Column(length = 30)
    private String updateUser;
    @UpdateTimestamp
    private Date updateTime;
    @Column(length = 30)
    private String createUser;
    @CreationTimestamp
    private Timestamp createTime;
    @Column(length = 50)
    private String address;
}
