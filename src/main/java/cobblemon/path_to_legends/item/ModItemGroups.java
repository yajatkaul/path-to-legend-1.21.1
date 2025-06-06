package cobblemon.path_to_legends.item;

import cobblemon.path_to_legends.PathToLegends;
import cobblemon.path_to_legends.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup PATH_TO_LEGENDS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(PathToLegends.MOD_ID, "path_to_legends_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.AZURE_FLUTE))
                    .displayName(Text.translatable("itemgroup.path_to_legends.path_to_legends_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.UXIE_CLAW);
                        entries.add(ModItems.MESPRIT_PLUME);
                        entries.add(ModItems.AZELF_FANG);
                        entries.add(ModItems.RED_CHAIN);
                        entries.add(ModItems.LIGHT_SHARD);
                        entries.add(ModItems.LIGHT_STONE);
                        entries.add(ModItems.DARK_SHARD);
                        entries.add(ModItems.DARK_STONE);
                        entries.add(ModItems.AZURE_FLUTE);
                        entries.add(ModItems.CELESTICA_FLUTE);
                        entries.add(ModBlocks.PEDESTAL);
                    }).build());
    public static void registerItemGroups(){
        PathToLegends.LOGGER.info("Registering Item Groups for " + PathToLegends.MOD_ID);
    }

}
