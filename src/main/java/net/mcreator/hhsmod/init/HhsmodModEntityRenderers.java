
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.hhsmod.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.hhsmod.client.renderer.AjaySisconeRenderer;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class HhsmodModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(HhsmodModEntities.AJAY_SISCONE.get(), AjaySisconeRenderer::new);
	}
}
