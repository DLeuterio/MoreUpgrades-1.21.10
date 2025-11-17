package net.dawmii.moreupgrades.item;

import net.dawmii.moreupgrades.MoreUpgrades;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item ENDERITE = registerItem("enderite", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(MoreUpgrades.MOD_ID, name), item);
    }
    public static void registerModItems() {
        MoreUpgrades.LOGGER.info("Registering Mod Items for " + MoreUpgrades.MOD_ID);
    }
}
