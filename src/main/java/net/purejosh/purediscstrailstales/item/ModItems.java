
package net.purejosh.purediscstrailstales.item;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.purejosh.purediscstrailstales.PureDiscsTrailsTales;
import net.purejosh.purediscstrailstales.sound.ModJukeboxSongs;

public class ModItems {
    // Discs
	public static final Item MUSIC_DISC_A_FAMILIAR_ROOM = register("music_disc_a_familiar_room", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.A_FAMILIAR_ROOM)));
	public static final Item MUSIC_DISC_BROMELIAD = register("music_disc_bromeliad", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.BROMELIAD)));
	public static final Item MUSIC_DISC_CRESCENT_DUNES = register("music_disc_crescent_dunes", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.CRESCENT_DUNES)));
	public static final Item MUSIC_DISC_ECHO_IN_THE_WIND = register("music_disc_echo_in_the_wind", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.ECHO_IN_THE_WIND)));

	// Helper method for registering an item.
	public static Item register(String id, Item item) {
		return Registry.register(Registries.ITEM, Identifier.of(PureDiscsTrailsTales.MOD_ID, id), item);
	}

	// Class initializer called from the entrypoint.
	public static void init() {
	}
}