package net.seniorteam.eggwars.arena;

import java.util.Set;

public interface Arena {

    String getName();

    Set<Island> getIslands();

    int getMaximumPlayers();

    int getMinimumPlayers();

    void setIslands(Set<Island> islands);

}
