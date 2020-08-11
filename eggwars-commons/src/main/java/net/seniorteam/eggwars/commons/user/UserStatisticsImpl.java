package net.seniorteam.eggwars.commons.user;

import net.seniorteam.eggwars.user.UserStatistics;

import java.util.function.Consumer;

public class UserStatisticsImpl implements UserStatistics {

    private int wins;
    private int played;
    private int eggsDestroyed;

    private int kills;
    private int deaths;
    private int coins;
    private int rank;

    public UserStatisticsImpl() {
        this.wins = 0;
        this.played = 0;
        this.eggsDestroyed = 0;

        this.kills = 0;
        this.deaths = 0;
        this.coins = 0;
        this.rank = 0;
    }

    public UserStatisticsImpl(int wins, int played, int eggsDestroyed, int kills, int deaths, int coins, int rank) {
        this.wins = wins;
        this.played = played;
        this.eggsDestroyed = eggsDestroyed;
        this.kills = kills;
        this.deaths = deaths;
        this.coins = coins;
        this.rank = rank;
    }

    @Override
    public int getWins() {
        return wins;
    }

    @Override
    public int getPlayed() {
        return played;
    }

    @Override
    public int getEggsDestroyed() {
        return eggsDestroyed;
    }

    @Override
    public int getKills() {
        return kills;
    }

    @Override
    public int getDeaths() {
        return deaths;
    }

    @Override
    public int getCoins() {
        return coins;
    }

    @Override
    public int getRank() {
        return rank;
    }

    @Override
    public void setWins(int wins) {
        this.wins = wins;
    }

    @Override
    public void setPlayed(int played) {
        this.played = played;
    }

    @Override
    public void setEggsDestroyed(int eggsDestroyed) {
        this.eggsDestroyed = eggsDestroyed;
    }

    @Override
    public void setKills(int kills) {
        this.kills = kills;
    }

    @Override
    public void setDeaths(int deaths) {
        this.deaths = deaths;
    }

    @Override
    public void setCoins(int coins) {
        this.coins = coins;
    }

    @Override
    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public UserStatistics with(Consumer<UserStatistics> consumer) {
        consumer.accept(this);
        return this;
    }
}
