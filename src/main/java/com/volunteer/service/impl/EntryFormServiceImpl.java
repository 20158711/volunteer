package com.volunteer.service.impl;

import com.volunteer.dao.EntryFormDao;
import com.volunteer.pojo.EntryForm;
import com.volunteer.service.EntryFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("entryFormService")
public class EntryFormServiceImpl implements EntryFormService {

    @Autowired
    private EntryFormDao entryFormDao;

    @Override
    public EntryForm save(EntryForm entryForm) {
        return entryFormDao.save(entryForm);
    }
}
