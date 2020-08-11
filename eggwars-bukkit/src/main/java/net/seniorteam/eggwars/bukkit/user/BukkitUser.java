package net.seniorteam.eggwars.bukkit.user;

import net.seniorteam.eggwars.commons.user.AbstractUser;
import net.seniorteam.eggwars.user.UserStatistics;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class BukkitUser extends AbstractUser<Player> {

    private Player player;

    public BukkitUser(Player player) {
        super(player.getUniqueId(), player.getName(), player);
        this.player = player;
    }

    public BukkitUser(Player player, UserStatistics statistics) {
        super(player.getUniqueId(), player.getName(), player, statistics);
        this.player = player;
    }

    @Override
    public void sendMessage(String message) {
        player.sendMessage(ChatColor.translateAlternateColorCodes('&', message));
    }

}
