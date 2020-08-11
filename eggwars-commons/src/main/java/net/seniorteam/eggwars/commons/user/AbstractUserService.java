package net.seniorteam.eggwars.commons.user;

import net.seniorteam.eggwars.user.User;
import net.seniorteam.eggwars.user.UserService;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.function.Predicate;

public abstract class AbstractUserService implements UserService {

    private final Set<User> users;

    public AbstractUserService() {
        users = new HashSet<>();
    }

    @Override
    public User getByUserName(String name) {
        return findByPredicate(user -> user.getName().equals(name));
    }

    @Override
    public User getUserByUUID(UUID uniqueId) {
        return findByPredicate(user -> user.getUniqueId().equals(uniqueId));
    }

    @Override
    public void create(User user) {
        Objects.requireNonNull(user, "user can't be null.");
        this.users.add(user);
    }

    @Override
    public void remove(User user) {
        Objects.requireNonNull(user, "user can't be null.");
        this.users.remove(user);
    }

    private User findByPredicate(Predicate<User> predicate) {
        return this.users.stream().filter(predicate).findAny().orElse(null);
    }


}
