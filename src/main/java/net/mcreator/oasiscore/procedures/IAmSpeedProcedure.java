package net.mcreator.oasiscore.procedures;

import net.neoforged.neoforge.event.tick.EntityTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.Entity;

import net.mcreator.oasiscore.entity.RickAstleyBossEntity;

import javax.annotation.Nullable;

@EventBusSubscriber
public class IAmSpeedProcedure {
	@SubscribeEvent
	public static void onEntityTick(EntityTickEvent.Pre event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof RickAstleyBossEntity) {
			entity.setDeltaMovement(new Vec3((entity.getLookAngle().x * 0.25), (entity.getLookAngle().y * 0.25), (entity.getLookAngle().z * 0.25)));
		}
	}
}
