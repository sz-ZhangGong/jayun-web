package site.jayun.jayunweb.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Dept {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long uid;
    @Column(length = 10)
    private String code;
    @Column(length = 30)
    private String name;
    @Column(length = 50, nullable = true)
    private String remark;
}
