package net.seniorteam.eggwars.command;

import net.seniorteam.eggwars.user.User;

public interface Command {

    String getName();

    void execute(User user, String[] args);

}
