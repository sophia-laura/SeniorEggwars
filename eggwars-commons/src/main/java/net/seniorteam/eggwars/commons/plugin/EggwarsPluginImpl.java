package net.seniorteam.eggwars.commons.plugin;

import net.seniorteam.eggwars.EggwarsPlugin;
import net.seniorteam.eggwars.user.UserService;

public class EggwarsPluginImpl implements EggwarsPlugin {

    UserService userService;

    @Override
    public UserService getUserService() {
        return userService;
    }
}
