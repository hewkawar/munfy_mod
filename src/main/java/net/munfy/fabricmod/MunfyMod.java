package net.munfy.fabricmod;

import net.fabricmc.api.ModInitializer;
import net.munfy.fabricmod.item.MoneyItems;
import net.munfy.fabricmod.item.MunfyItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MunfyMod implements ModInitializer {
	public static final String MOD_ID = "munfymod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		MoneyItems.registerModItems();
		MunfyItems.registerModItems();

	}
}
