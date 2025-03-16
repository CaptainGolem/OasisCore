
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.oasiscore.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.oasiscore.client.renderer.RickAstleyBossRenderer;
import net.mcreator.oasiscore.client.renderer.MemoriaSoyjakRenderer;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class OasiscoreModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(OasiscoreModEntities.MEMORIA_SOYJAK.get(), MemoriaSoyjakRenderer::new);
		event.registerEntityRenderer(OasiscoreModEntities.RICK_ASTLEY_BOSS.get(), RickAstleyBossRenderer::new);
	}
}
