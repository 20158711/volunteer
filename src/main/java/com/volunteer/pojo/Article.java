package com.volunteer.pojo;

import lombok.Data;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.DynamicInsert;

import javax.persistence.*;
import java.util.List;

@Data
@Entity(name = "article")
@DynamicInsert
public class Article {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "title",nullable = false)
    private String title;

    @Column(name = "content",nullable = false)
    private String content;

    @Column(name = "is_allow_entry",nullable = false)
    private Boolean isAllowEntry;

    @OneToOne(fetch = FetchType.EAGER,cascade = {CascadeType.REMOVE})
    private List<EntryForm> entryFormList;

    @Column(name = "type")
    private Integer type;

    @Column(name = "insert_time")
    @ColumnDefault("current_timestamp")
    private Data insertTime;

}
