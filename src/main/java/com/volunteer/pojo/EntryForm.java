package com.volunteer.pojo;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name = "entry_form")
public class EntryForm {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    private User user;

    @Column(name = "state")
    private Integer state;

}
