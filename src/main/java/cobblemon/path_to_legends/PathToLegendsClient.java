package cobblemon.path_to_legends;

import cobblemon.path_to_legends.block.custom.entity.ModBlockEntities;
import cobblemon.path_to_legends.block.custom.renderer.PedestalBlockEntityRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;

public class PathToLegendsClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        BlockEntityRendererFactories.register(ModBlockEntities.PEDESTAL_BE, PedestalBlockEntityRenderer::new);
    }
}
