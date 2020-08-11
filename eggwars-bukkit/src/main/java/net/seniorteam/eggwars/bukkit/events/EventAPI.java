package net.seniorteam.eggwars.bukkit.events;

import org.bukkit.Bukkit;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class EventAPI extends Event {

    private static final HandlerList handlerList = new HandlerList();

    public void call() {
        Bukkit.getPluginManager().callEvent(this);
    }

    public HandlerList getHandlers() {
        return handlerList;
    }

    public static HandlerList getHandlerList() {
        return handlerList;
    }
}
