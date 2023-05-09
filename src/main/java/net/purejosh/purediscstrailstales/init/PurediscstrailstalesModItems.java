
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.purejosh.purediscstrailstales.init;

import net.purejosh.purediscstrailstales.item.MusicDiscRelicItem;
import net.purejosh.purediscstrailstales.item.MusicDiscEchoInTheWindItem;
import net.purejosh.purediscstrailstales.item.MusicDiscCrescentDunesItem;
import net.purejosh.purediscstrailstales.item.MusicDiscBromeliadItem;
import net.purejosh.purediscstrailstales.item.MusicDiscAFamiliarRoomItem;
import net.purejosh.purediscstrailstales.PurediscstrailstalesMod;

import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

public class PurediscstrailstalesModItems {
	public static Item MUSIC_DISC_BROMELIAD;
	public static Item MUSIC_DISC_A_FAMILIAR_ROOM;
	public static Item MUSIC_DISC_CRESCENT_DUNES;
	public static Item MUSIC_DISC_ECHO_IN_THE_WIND;
	public static Item MUSIC_DISC_RELIC;

	public static void load() {
		MUSIC_DISC_BROMELIAD = Registry.register(Registry.ITEM, new ResourceLocation(PurediscstrailstalesMod.MODID, "music_disc_bromeliad"), new MusicDiscBromeliadItem());
		MUSIC_DISC_A_FAMILIAR_ROOM = Registry.register(Registry.ITEM, new ResourceLocation(PurediscstrailstalesMod.MODID, "music_disc_a_familiar_room"), new MusicDiscAFamiliarRoomItem());
		MUSIC_DISC_CRESCENT_DUNES = Registry.register(Registry.ITEM, new ResourceLocation(PurediscstrailstalesMod.MODID, "music_disc_crescent_dunes"), new MusicDiscCrescentDunesItem());
		MUSIC_DISC_ECHO_IN_THE_WIND = Registry.register(Registry.ITEM, new ResourceLocation(PurediscstrailstalesMod.MODID, "music_disc_echo_in_the_wind"), new MusicDiscEchoInTheWindItem());
		MUSIC_DISC_RELIC = Registry.register(Registry.ITEM, new ResourceLocation(PurediscstrailstalesMod.MODID, "music_disc_relic"), new MusicDiscRelicItem());
	}
}
