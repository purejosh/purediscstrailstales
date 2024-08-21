package net.purejosh.purediscstrailstales;

import net.fabricmc.api.ModInitializer;
import net.purejosh.purediscstrailstales.item.ModItemGroups;
import net.purejosh.purediscstrailstales.item.ModItems;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PureDiscsTrailsTales implements ModInitializer {
	public static final String MOD_ID = "purediscstrailstales";
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

	// This code is executed when the mod is loaded.
	@Override
	public void onInitialize() {
		// This is the log line that gets printed when the mod is loaded.
		LOGGER.info("Pure Discs - Trails & Tales by purejosh has been loaded!");
		// Now, I call the init methods in the registry classes.
		ModItems.init();
		ModItemGroups.init();
	}
}