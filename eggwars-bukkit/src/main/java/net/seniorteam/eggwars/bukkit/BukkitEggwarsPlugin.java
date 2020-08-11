package net.seniorteam.eggwars.bukkit;

import net.seniorteam.eggwars.bukkit.user.BukkitUserService;
import net.seniorteam.eggwars.plugin.EggwarsPluginBootstrap;
import org.bukkit.plugin.java.JavaPlugin;

public class BukkitEggwarsPlugin extends JavaPlugin {

    private EggwarsPluginBootstrap bootstrap;

    @Override
    public void onEnable() {
        bootstrap = new BukkitEggwarsPluginBoostrap(this);
        bootstrap.setUserService(new BukkitUserService());
        bootstrap.enable();
    }

    public EggwarsPluginBootstrap getBootstrap() {
        return bootstrap;
    }
}
