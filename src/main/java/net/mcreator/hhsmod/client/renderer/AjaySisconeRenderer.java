
package net.mcreator.hhsmod.client.renderer;

public class AjaySisconeRenderer extends HumanoidMobRenderer<AjaySisconeEntity, HumanoidModel<AjaySisconeEntity>> {
	public AjaySisconeRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel<AjaySisconeEntity>(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	public ResourceLocation getTextureLocation(AjaySisconeEntity entity) {
		return ResourceLocation.parse("hhsmod:textures/entities/texture_1.png");
	}
}