package net.seniorteam.eggwars.match;

import net.seniorteam.eggwars.user.User;

import java.util.Set;

public interface MatchService {

    Match getById(int id);

    Match getByUser(User user);

    Set<Match> findAll();

    Set<Match> findAllByStatus(MatchStatus status);

    Set<Match> findAllByArenaName(String arenaName);

    void create(Match match);

}
