package net.seniorteam.eggwars.user;

import java.util.function.Consumer;

public interface UserStatistics {

    int getWins();

    int getPlayed();

    int getEggsDestroyed();

    int getKills();

    int getDeaths();

    int getCoins();

    int getRank();

    void setWins(int wins);

    void setPlayed(int played);

    void setEggsDestroyed(int eggsDestroyed);

    void setKills(int kills);

    void setDeaths(int deaths);

    void setCoins(int coins);

    void setRank(int rank);

    UserStatistics with(Consumer<UserStatistics> consumer);

}
