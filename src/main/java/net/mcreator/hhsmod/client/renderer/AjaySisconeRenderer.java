
package net.mcreator.hhsmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.hhsmod.entity.AjaySisconeEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class AjaySisconeRenderer extends HumanoidMobRenderer<AjaySisconeEntity, HumanoidModel<AjaySisconeEntity>> {
	public AjaySisconeRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel<AjaySisconeEntity>(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
		this.addLayer(new RenderLayer<AjaySisconeEntity, HumanoidModel<AjaySisconeEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("hhsmod:textures/entities/texture_1_1.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, AjaySisconeEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(AjaySisconeEntity entity) {
		return ResourceLocation.parse("hhsmod:textures/entities/texture_1_1_2.png");
	}
}
