
package net.purejosh.purediscstrailstales.item;

import net.purejosh.purediscstrailstales.init.PurediscstrailstalesModSounds;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class MusicDiscEchoInTheWindItem extends RecordItem {
	public MusicDiscEchoInTheWindItem() {
		super(14, PurediscstrailstalesModSounds.ECHO_IN_THE_WIND, new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1).rarity(Rarity.RARE), 5923);
	}
}
