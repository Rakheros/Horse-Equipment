package net.rakheros.horseequipment;

import net.fabricmc.api.ModInitializer;

import net.rakheros.horseequipment.item.ModItemGroups;
import net.rakheros.horseequipment.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HorseEquipment implements ModInitializer {
	public static final String MOD_ID = "horse-equipment";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
	}
}