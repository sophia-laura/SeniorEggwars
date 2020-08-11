package net.seniorteam.eggwars.kit;

public interface Kit {

    String getName();

    String getPermission();

    int getPrice();

    KitIcon getIcon();

    int getIconSlot();

    boolean hasSpecialAbility();

    boolean isActivate();

}
