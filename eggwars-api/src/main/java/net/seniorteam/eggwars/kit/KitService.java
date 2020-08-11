package net.seniorteam.eggwars.kit;

import java.util.List;

public interface KitService {

    List<Kit> findAll();

    Kit getByName(String name);

    void add(Kit kit);

    void remove(Kit kit);

}
