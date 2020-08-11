package net.seniorteam.eggwars.commons.user;

import net.seniorteam.eggwars.user.User;
import net.seniorteam.eggwars.user.UserStatistics;

import java.util.UUID;

public abstract class AbstractUser<E> implements User<E> {

    private final UUID uniqueId;
    private final String name;
    private final E entity;

    private UserStatistics statistics;

    public AbstractUser(UUID uniqueId, String name, E entity) {
        this.uniqueId = uniqueId;
        this.name = name;
        this.entity = entity;

        this.statistics = new UserStatisticsImpl();
    }

    public AbstractUser(UUID uniqueId, String name, E entity, UserStatistics statistics) {
        this.uniqueId = uniqueId;
        this.name = name;
        this.entity = entity;

        this.statistics = statistics;
    }

    @Override
    public E getEntity() {
        return entity;
    }

    @Override
    public UUID getUniqueId() {
        return uniqueId;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public UserStatistics getStatistics() {
        return statistics;
    }
}
