package net.seniorteam.eggwars.arena;

import net.seniorteam.eggwars.location.Location;

public interface Island {

    Location getSpawnLocation();

    Location getEggLocation();

    Location waitingLocation();

}
