package net.seniorteam.eggwars.commons.kit;

import net.seniorteam.eggwars.kit.Kit;
import net.seniorteam.eggwars.kit.KitIcon;

public class KitImpl implements Kit {

    private String name;
    private String permission;
    private int price;
    private KitIcon icon;
    private int iconSlot;
    private boolean specialAbility;
    private boolean activate;

    public KitImpl(String name, String permission, int price, KitIcon icon, int iconSlot, boolean specialAbility, boolean activate) {
        this.name = name;
        this.permission = permission;
        this.price = price;
        this.icon = icon;
        this.iconSlot = iconSlot;
        this.specialAbility = specialAbility;
        this.activate = activate;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getPermission() {
        return permission;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public KitIcon getIcon() {
        return icon;
    }

    @Override
    public int getIconSlot() {
        return iconSlot;
    }

    @Override
    public boolean hasSpecialAbility() {
        return specialAbility;
    }

    @Override
    public boolean isActivate() {
        return activate;
    }
}
