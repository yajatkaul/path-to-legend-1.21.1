package name.modid;

import name.modid.block.ModBlocks;
import name.modid.item.ModItemGroups;
import name.modid.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PathToLegends implements ModInitializer {
	public static final String MOD_ID = "path_to_legends";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}