package net.seniorteam.eggwars.commons.plugin;

import net.seniorteam.eggwars.plugin.EggwarsPluginBootstrap;
import net.seniorteam.eggwars.user.UserService;

public abstract class AbstractEggwarsPluginBootstrap implements EggwarsPluginBootstrap {

    @Override
    public final void enable() {
    }

    @Override
    public final void disable() {

    }

    @Override
    public void setUserService(UserService userService) {
        EggwarsPluginImpl plugin = (EggwarsPluginImpl) getPlugin();
        plugin.userService = userService;
    }
}