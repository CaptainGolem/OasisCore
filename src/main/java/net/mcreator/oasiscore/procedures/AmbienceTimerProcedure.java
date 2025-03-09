package net.mcreator.oasiscore.procedures;

import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.mcreator.oasiscore.network.OasiscoreModVariables;

import javax.annotation.Nullable;

@EventBusSubscriber
public class AmbienceTimerProcedure {
	@SubscribeEvent
	public static void onPlayerTick(PlayerTickEvent.Post event) {
		execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double AmbientTimer = 0;
		if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("oasiscore:memoria"))) {
			{
				OasiscoreModVariables.PlayerVariables _vars = entity.getData(OasiscoreModVariables.PLAYER_VARIABLES);
				_vars.untilmusic = entity.getData(OasiscoreModVariables.PLAYER_VARIABLES).untilmusic + 1;
				_vars.syncPlayerVariables(entity);
			}
			if (entity.getData(OasiscoreModVariables.PLAYER_VARIABLES).untilmusic == 6000) {
				AmbiencePlayerProcedure.execute(world, x, y, z, entity);
				{
					OasiscoreModVariables.PlayerVariables _vars = entity.getData(OasiscoreModVariables.PLAYER_VARIABLES);
					_vars.untilmusic = 0;
					_vars.syncPlayerVariables(entity);
				}
			}
		}
	}
}
