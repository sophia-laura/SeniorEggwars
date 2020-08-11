package net.seniorteam.eggwars.kit;

import java.util.List;

public interface KitIcon<I> {

    int getId();

    String getName();

    List<String> getLore();

    I build();

}
