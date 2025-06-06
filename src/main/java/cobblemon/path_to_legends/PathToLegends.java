package cobblemon.path_to_legends;

import cobblemon.path_to_legends.block.ModBlocks;
import cobblemon.path_to_legends.block.custom.entity.ModBlockEntities;
import cobblemon.path_to_legends.item.ModItemGroups;
import cobblemon.path_to_legends.item.ModItems;
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
		ModBlockEntities.registerBlockEntities();
	}
}