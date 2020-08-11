package net.seniorteam.eggwars.bukkit;

import net.seniorteam.eggwars.EggwarsPlugin;
import net.seniorteam.eggwars.command.Command;
import net.seniorteam.eggwars.commons.Constants;
import net.seniorteam.eggwars.commons.plugin.AbstractEggwarsPluginBootstrap;
import net.seniorteam.eggwars.commons.plugin.EggwarsPluginImpl;
import net.seniorteam.eggwars.user.User;
import org.bukkit.command.PluginCommand;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public class BukkitEggwarsPluginBoostrap extends AbstractEggwarsPluginBootstrap {

    private JavaPlugin plugin;
    private EggwarsPlugin eggwarsPlugin;

    public BukkitEggwarsPluginBoostrap(JavaPlugin plugin) {
        this.plugin = plugin;
        this.eggwarsPlugin = new EggwarsPluginImpl();
    }

    @Override
    public EggwarsPlugin getPlugin() {
        return eggwarsPlugin;
    }

    @Override
    public void registerCommand(Command command) {
        PluginCommand pluginCommand = plugin.getCommand(command.getName());

        if (pluginCommand == null) {
            getLogger().warning("Couldn't register /" + command.getName() + ". Is it on plugin.yml?");
            return;
        }

        pluginCommand.setExecutor((commandSender, bukkitCommand, label, args) -> {
            if (!(commandSender instanceof Player)) {
                commandSender.sendMessage(Constants.COMMAND_ONLY_PLAYERS);
                return false;
            }

            User<Player> user = eggwarsPlugin.getUserService().getUserByEntity((Player) commandSender);
            command.execute(user, args);
            return true;
        });
    }

    @Override
    public Logger getLogger() {
        return plugin.getLogger();
    }
}
