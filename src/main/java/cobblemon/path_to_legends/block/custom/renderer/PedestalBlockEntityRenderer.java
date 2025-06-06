package cobblemon.path_to_legends.block.custom.renderer;

import cobblemon.path_to_legends.block.custom.SimplePedestalBlock;
import cobblemon.path_to_legends.block.custom.entity.PedestalBlockEntity;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.block.entity.BlockEntityRenderer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import net.minecraft.client.render.model.json.ModelTransformationMode;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.RotationAxis;

public class PedestalBlockEntityRenderer implements BlockEntityRenderer<PedestalBlockEntity> {
    public PedestalBlockEntityRenderer(BlockEntityRendererFactory.Context context) {
    }

    public void render(PedestalBlockEntity blockEntity, float tickDelta, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, int overlay) {
        ItemStack stack = blockEntity.getItems().getStack(0);
        if (!stack.isEmpty()) {
            Direction facing = blockEntity.getCachedState().get(SimplePedestalBlock.FACING);
            float angle = switch (facing) {
                case NORTH -> 0f;
                case EAST -> 270f;
                case WEST -> 90f;
                default -> 180f;
            };

            matrices.push();
            matrices.translate(0.5, 1.15, 0.5);
            matrices.scale(0.5f, 0.5f, 0.5f);
            matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(angle));

            MinecraftClient.getInstance().getItemRenderer().renderItem(
                    stack,
                    ModelTransformationMode.FIXED,
                    light,
                    overlay,
                    matrices,
                    vertexConsumers,
                    null,
                    0
            );

            matrices.pop();
        }
    }
}
