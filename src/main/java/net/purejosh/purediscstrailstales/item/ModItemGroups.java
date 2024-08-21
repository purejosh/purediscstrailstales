package net.purejosh.purediscstrailstales.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;

public class ModItemGroups {

    public static void init() {
        // Discs
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register((itemGroup) -> itemGroup.addAfter(
                Items.MUSIC_DISC_PIGSTEP.getDefaultStack(), ModItems.MUSIC_DISC_A_FAMILIAR_ROOM.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register((itemGroup) -> itemGroup.addAfter(
            ModItems.MUSIC_DISC_A_FAMILIAR_ROOM.getDefaultStack(), ModItems.MUSIC_DISC_BROMELIAD.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register((itemGroup) -> itemGroup.addAfter(
            ModItems.MUSIC_DISC_BROMELIAD.getDefaultStack(), ModItems.MUSIC_DISC_CRESCENT_DUNES.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register((itemGroup) -> itemGroup.addAfter(
            ModItems.MUSIC_DISC_CRESCENT_DUNES.getDefaultStack(), ModItems.MUSIC_DISC_ECHO_IN_THE_WIND.getDefaultStack()));
    }
}
