package net.seniorteam.eggwars.match;

public enum MatchStatus {

    PREGAME, GAME, FINAL;

    public boolean isAfter(MatchStatus status) {
        return ordinal() > status.ordinal();
    }

    public boolean isBefore(MatchStatus status) {
        return ordinal() < status.ordinal();
    }

}
