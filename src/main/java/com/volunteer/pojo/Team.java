package com.volunteer.pojo;

import lombok.Data;
import org.hibernate.annotations.DynamicInsert;

import javax.persistence.*;
import java.util.List;

@Data
@DynamicInsert
@Entity(name = "team")
public class Team {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "login_name",nullable = false)
    private String loginName;

    @Column(name = "team_name",nullable = false)
    private String teamName;

    @Column(name = "password",nullable = false)
    private String password;

    @Column(name = "introduce",nullable = false)
    private String introduce;

    @OneToMany(fetch = FetchType.EAGER,targetEntity = Article.class)
    private List<Article> articleList;

    @OneToMany(fetch = FetchType.EAGER,mappedBy = "team")
    private List<TeamUser>  teamUserList;

}
