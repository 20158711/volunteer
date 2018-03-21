package com.volunteer.dao;

import com.volunteer.pojo.EntryForm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntryFormDao extends JpaRepository<EntryForm,Long> {

}
