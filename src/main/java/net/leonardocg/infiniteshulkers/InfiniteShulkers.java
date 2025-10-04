package net.leonardocg.infiniteshulkers;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InfiniteShulkers implements ModInitializer {
	public static final String MOD_ID = "infinite-shulkers";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Starting Infinite Shulkers...");
	}
}