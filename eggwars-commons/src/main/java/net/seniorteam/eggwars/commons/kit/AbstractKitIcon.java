package net.seniorteam.eggwars.commons.kit;

import net.seniorteam.eggwars.kit.KitIcon;

import java.util.Arrays;
import java.util.List;

public abstract class AbstractKitIcon<I> implements KitIcon<I> {

    private final int itemId;
    private final String name;
    private final List<String> lore;

    public AbstractKitIcon(int itemId, String name, String... lore) {
        this.itemId = itemId;
        this.name = name;
        this.lore = Arrays.asList(lore);
    }

    @Override
    public int getId() {
        return itemId;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public List<String> getLore() {
        return lore;
    }
}
