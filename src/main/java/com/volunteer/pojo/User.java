package com.volunteer.pojo;

import lombok.Data;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.DynamicInsert;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Entity(name = "user")
@DynamicInsert
public class User {


    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "login_name",nullable = false)
    private String loginName;

    @Column(name = "username",nullable = false)
    private String password;

    @Column(name = "personalized_signature",nullable = false)
    @ColumnDefault("这个人很懒，什么也没有留下")
    private String personalizedSignature;

    @Column(name = "age",nullable = false)
    private Integer age;

    @OneToMany(fetch = FetchType.EAGER,mappedBy = "user")
    @JoinColumn(name = "user_id")
    private List<TeamUser> teamUserList;

}
