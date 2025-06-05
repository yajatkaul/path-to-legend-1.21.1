package cobblemon.path_to_legends.block;

import com.cobblemon.yajatkaul.mega_showdown.block.custom.PedestalBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import cobblemon.path_to_legends.PathToLegends;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block PEDESTAL = registerBlock("pedestal",
            new PedestalBlock(AbstractBlock.Settings.create().nonOpaque()));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(PathToLegends.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(PathToLegends.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        PathToLegends.LOGGER.info("Registering Mod Block for "+ PathToLegends.MOD_ID);
    }
}
