package net.seniorteam.eggwars.arena;

public interface ArenaService {

    Arena getByName(String name);

    void add(Arena arena);

    void remove(Arena arena);

}
