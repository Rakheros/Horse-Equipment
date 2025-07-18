package net.rakheros.horseequipment.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.rakheros.horseequipment.HorseEquipment;

public class ModItemGroups {
    public static final ItemGroup HORSE_EQUIPMENT_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(HorseEquipment.MOD_ID, "horse_equipment_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(Registries.ITEM.get(Identifier.of(HorseEquipment.MOD_ID, "netherite_horse_armor"))))
                    .displayName(Text.translatable("itemgoup.horse-equipment.horse_equipment_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.NETHERITE_HORSE_ARMOR);
                    }).build()
    );

    public static void registerItemGroups() {
        HorseEquipment.LOGGER.info("Registering Item Groups for " + HorseEquipment.MOD_ID);
    }
}