package com.volunteer.dao;

import com.volunteer.pojo.TeamUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamUserDao extends JpaRepository<TeamUser,Long>{

    TeamUser findByTeamIdAndUserId(Long teamId,Long userId);

}
