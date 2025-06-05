package cobblemon.path_to_legends.item;

import cobblemon.path_to_legends.PathToLegends;
import cobblemon.path_to_legends.item.custom.FluteItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.List;

public class ModItems {
    public static final Item AZURE_FLUTE = registerItem("azure_flute", new Item(new Item.Settings()){
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("item.path_to_legends.azure_flute.tooltip"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    }) ;
    public static final Item UXIE_CLAW = registerItem("uxie_claw", new Item(new Item.Settings()){
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("item.path_to_legends.uxie_claw.tooltip"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });
    public static final Item MESPRIT_PLUME = registerItem("mesprit_plume", new Item(new Item.Settings()){
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("item.path_to_legends.mesprit_plume.tooltip"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });
    public static final Item AZELF_FANG = registerItem("azelf_fang", new Item(new Item.Settings()){
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("item.path_to_legends.azelf_fang.tooltip"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });
    public static final Item RED_CHAIN = registerItem("red_chain", new Item(new Item.Settings()){
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("item.path_to_legends.red_chain.tooltip"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });
    public static final Item LIGHT_SHARD = registerItem("light_shard", new Item(new Item.Settings()){
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("item.path_to_legends.light_shard.tooltip"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });
    public static final Item LIGHT_STONE = registerItem("light_stone", new Item(new Item.Settings()){
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("item.path_to_legends.light_stone.tooltip"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });
    public static final Item DARK_SHARD = registerItem("dark_shard", new Item(new Item.Settings()){
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("item.path_to_legends.dark_shard.tooltip"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });
    public static final Item DARK_STONE = registerItem("dark_stone", new Item(new Item.Settings()){
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("item.path_to_legends.dark_stone.tooltip"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });

    public static final Item CELESTICA_FLUTE = registerItem("celestica_flute",
            new FluteItem(new Item.Settings(), "path_to_legends:flute")
    );

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(PathToLegends.MOD_ID, name), item);
    }


    public static void registerModItems() {
        PathToLegends.LOGGER.info("Registering Mod Items for "+ PathToLegends.MOD_ID);
    }
}
