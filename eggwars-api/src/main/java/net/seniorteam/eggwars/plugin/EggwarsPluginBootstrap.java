package net.seniorteam.eggwars.plugin;

import net.seniorteam.eggwars.EggwarsPlugin;
import net.seniorteam.eggwars.command.Command;
import net.seniorteam.eggwars.user.UserService;

import java.util.logging.Logger;

public interface EggwarsPluginBootstrap {

    EggwarsPlugin getPlugin();

    void enable();

    void disable();

    void registerCommand(Command command);

    void setUserService(UserService userService);

    Logger getLogger();

}
