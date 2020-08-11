package net.seniorteam.eggwars.commons.match;

import net.seniorteam.eggwars.arena.Arena;
import net.seniorteam.eggwars.match.Match;
import net.seniorteam.eggwars.match.MatchStatus;
import net.seniorteam.eggwars.user.User;

import java.util.Set;

public abstract class AbstractMatch implements Match {

    private final int id;
    private final Arena arena;
    private final Set<User> players;
    private MatchStatus status;
    private int time;

    public AbstractMatch(int id, Arena arena, Set<User> players, MatchStatus status, int time) {
        this.id = id;
        this.arena = arena;
        this.players = players;
        this.status = status;
        this.time = time;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public Arena getArena() {
        return arena;
    }

    @Override
    public Set<User> getPlayers() {
        return players;
    }

    @Override
    public MatchStatus getStatus() {
        return status;
    }

    @Override
    public int getTime() {
        return time;
    }

    @Override
    public void setStatus(MatchStatus status) {
        this.status = status;
    }

    @Override
    public void addPlayer(User user) {
        this.players.add(user);
    }
}
