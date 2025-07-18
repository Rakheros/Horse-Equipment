package net.rakheros.horseequipment.item;

import net.minecraft.item.AnimalArmorItem;
import net.minecraft.item.ArmorMaterials;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.rakheros.horseequipment.HorseEquipment;

public class ModItems {
    public static Item NETHERITE_HORSE_ARMOR = registerItem("netherite_horse_armor",
            new AnimalArmorItem(ArmorMaterials.NETHERITE, AnimalArmorItem.Type.EQUESTRIAN, false, new Item.Settings().maxCount(1)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(HorseEquipment.MOD_ID, name), item);
    }

    public static void registerModItems() {
        HorseEquipment.LOGGER.info("Registering mod items for " + HorseEquipment.MOD_ID);

    }
}
