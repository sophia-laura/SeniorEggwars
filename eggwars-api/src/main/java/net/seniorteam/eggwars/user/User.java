package net.seniorteam.eggwars.user;

import java.util.UUID;

public interface User<E> {

    E getEntity();

    UUID getUniqueId();

    String getName();

    UserStatistics getStatistics();

    void sendMessage(String message);

}
