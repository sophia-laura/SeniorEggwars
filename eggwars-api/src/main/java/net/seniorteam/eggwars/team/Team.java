package net.seniorteam.eggwars.team;

import net.seniorteam.eggwars.arena.Island;
import net.seniorteam.eggwars.user.User;

import java.util.Set;

public interface Team {

    TeamColor getColor();

    Set<User> findAllUsers();

    void add(User user);

    void remove(User user);

    Island getIsland();

}
