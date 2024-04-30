
package net.purejosh.purediscstrailstales.item;

import net.purejosh.purediscstrailstales.init.PurediscstrailstalesModSounds;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTabs;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

public class MusicDiscAFamiliarRoomItem extends RecordItem {
	public MusicDiscAFamiliarRoomItem() {
		super(14, PurediscstrailstalesModSounds.A_FAMILIAR_ROOM, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 4824);
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.TOOLS_AND_UTILITIES).register(content -> content.accept(this));
	}
}
