package com.volunteer.service;

import com.volunteer.pojo.TeamUser;

public interface TeamUserService {

    TeamUser applyAddToTeam(Long teamId, Long userId);
    TeamUser checkState(Long teamId,Long userId,Integer state);
    TeamUser findByTeamIdAndUserId(Long teamId,Long userId);

}
