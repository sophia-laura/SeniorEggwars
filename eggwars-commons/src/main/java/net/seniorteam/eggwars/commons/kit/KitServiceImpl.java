package net.seniorteam.eggwars.commons.kit;

import net.seniorteam.eggwars.kit.Kit;
import net.seniorteam.eggwars.kit.KitService;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class KitServiceImpl implements KitService {

    private final List<Kit> kits;

    public KitServiceImpl() {
        kits = new ArrayList<>();
    }

    @Override
    public List<Kit> findAll() {
        return kits;
    }

    @Override
    public Kit getByName(String name) {
        return kits.stream().filter(kit -> kit.getName().equals(name)).findAny().orElse(null);
    }

    @Override
    public void add(Kit kit) {
        Objects.requireNonNull(kit, "kit can't be null.");
        this.kits.add(kit);
    }

    @Override
    public void remove(Kit kit) {
        Objects.requireNonNull(kit, "kit can't be null.");
        this.kits.remove(kit);
    }
}
