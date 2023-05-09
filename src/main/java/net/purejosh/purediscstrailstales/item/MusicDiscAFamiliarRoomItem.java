
package net.purejosh.purediscstrailstales.item;

import net.purejosh.purediscstrailstales.init.PurediscstrailstalesModSounds;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class MusicDiscAFamiliarRoomItem extends RecordItem {
	public MusicDiscAFamiliarRoomItem() {
		super(14, PurediscstrailstalesModSounds.A_FAMILIAR_ROOM, new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1).rarity(Rarity.RARE), 4824);
	}
}
