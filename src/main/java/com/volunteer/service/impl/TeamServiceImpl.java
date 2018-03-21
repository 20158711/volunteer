package com.volunteer.service.impl;

import com.volunteer.dao.TeamDao;
import com.volunteer.pojo.Team;
import com.volunteer.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("teamService")
public class TeamServiceImpl implements TeamService {

    @Autowired
    private TeamDao teamDao;

    @Override
    public Team findById(Long id) {
        return teamDao.getOne(id);
    }

    @Override
    public Team findTeamByLoginNameAndPassword(String loginName, String password) {
        return teamDao.findByLoginNameAndPassword(loginName,password);
    }

    @Override
    public Team save(Team team) {
        return teamDao.save(team);
    }

    @Override
    public List<Team> findAll() {
        return teamDao.findAll();
    }
}
