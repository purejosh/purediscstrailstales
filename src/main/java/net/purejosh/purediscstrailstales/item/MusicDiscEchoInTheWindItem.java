
package net.purejosh.purediscstrailstales.item;

import net.purejosh.purediscstrailstales.init.PurediscstrailstalesModSounds;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTabs;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

public class MusicDiscEchoInTheWindItem extends RecordItem {
	public MusicDiscEchoInTheWindItem() {
		super(14, PurediscstrailstalesModSounds.ECHO_IN_THE_WIND, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 5923);
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.TOOLS_AND_UTILITIES).register(content -> content.accept(this));
	}
}
