package net.purejosh.purediscstrailstales.sound;

import net.minecraft.block.jukebox.JukeboxSong;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.purejosh.purediscstrailstales.PureDiscsTrailsTales;

public interface ModJukeboxSongs {

    RegistryKey<JukeboxSong> A_FAMILIAR_ROOM = of("a_familiar_room");
    RegistryKey<JukeboxSong> BROMELIAD = of("bromeliad");
    RegistryKey<JukeboxSong> CRESCENT_DUNES = of("crescent_dunes");
    RegistryKey<JukeboxSong> ECHO_IN_THE_WIND = of("echo_in_the_wind");

    private static RegistryKey<JukeboxSong> of(String id) {
        return RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(PureDiscsTrailsTales.MOD_ID, id));
    }
}
