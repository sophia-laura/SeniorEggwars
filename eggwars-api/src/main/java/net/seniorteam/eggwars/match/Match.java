package net.seniorteam.eggwars.match;

import net.seniorteam.eggwars.arena.Arena;
import net.seniorteam.eggwars.user.User;

import java.util.Set;

public interface Match {

    int getId();

    Arena getArena();

    Set<User> getPlayers();

    MatchStatus getStatus();

    int getTime();

    void setStatus(MatchStatus status);

    void incrementTime();

    void addPlayer(User user);

}
