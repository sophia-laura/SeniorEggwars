package net.seniorteam.eggwars.user;

import java.util.UUID;

public interface UserService {

    User getByUserName(String name);

    User getUserByUUID(UUID uniqueId);

    <E> User<E> getUserByEntity(E entity);

    void create(User user);

    void remove(User user);

}
