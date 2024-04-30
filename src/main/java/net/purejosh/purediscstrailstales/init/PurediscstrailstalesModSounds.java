
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.purejosh.purediscstrailstales.init;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

public class PurediscstrailstalesModSounds {
	public static SoundEvent ECHO_IN_THE_WIND = SoundEvent.createVariableRangeEvent(new ResourceLocation("purediscstrailstales", "echo_in_the_wind"));
	public static SoundEvent A_FAMILIAR_ROOM = SoundEvent.createVariableRangeEvent(new ResourceLocation("purediscstrailstales", "a_familiar_room"));
	public static SoundEvent BROMELIAD = SoundEvent.createVariableRangeEvent(new ResourceLocation("purediscstrailstales", "bromeliad"));
	public static SoundEvent CRESCENT_DUNES = SoundEvent.createVariableRangeEvent(new ResourceLocation("purediscstrailstales", "crescent_dunes"));

	public static void load() {
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("purediscstrailstales", "echo_in_the_wind"), ECHO_IN_THE_WIND);
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("purediscstrailstales", "a_familiar_room"), A_FAMILIAR_ROOM);
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("purediscstrailstales", "bromeliad"), BROMELIAD);
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("purediscstrailstales", "crescent_dunes"), CRESCENT_DUNES);
	}
}
