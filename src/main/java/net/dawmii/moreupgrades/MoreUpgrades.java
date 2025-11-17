package net.dawmii.moreupgrades;

import net.dawmii.moreupgrades.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoreUpgrades implements ModInitializer {
	public static final String MOD_ID = "moreupgrades";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    //Test comment for commit

	@Override
	public void onInitialize() {
        ModItems.registerModItems();
	}
}