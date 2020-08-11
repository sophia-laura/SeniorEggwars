package net.seniorteam.eggwars.commons.match;

import net.seniorteam.eggwars.match.Match;
import net.seniorteam.eggwars.match.MatchService;
import net.seniorteam.eggwars.match.MatchStatus;
import net.seniorteam.eggwars.user.User;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class MatchServiceImpl implements MatchService {

    private final Set<Match> matches;

    public MatchServiceImpl() {
        matches = new HashSet<>();
    }

    @Override
    public Match getById(int id) {
        return matches.stream().filter(match -> match.getId() == id).findAny().orElse(null);
    }

    @Override
    public Match getByUser(User user) {
        return matches.stream().filter(match -> match.getPlayers().contains(user)).findAny().orElse(null);
    }

    @Override
    public Set<Match> findAll() {
        return matches;
    }

    @Override
    public Set<Match> findAllByStatus(MatchStatus status) {
        return matches.stream().filter(match -> match.getStatus() == status).collect(Collectors.toSet());
    }

    @Override
    public Set<Match> findAllByArenaName(String arenaName) {
        return matches.stream().filter(match -> match.getArena().getName().equals(arenaName)).collect(Collectors.toSet());
    }

    @Override
    public void create(Match match) {
        Objects.requireNonNull(match, "match can't be null.");
        this.matches.add(match);
    }
}
