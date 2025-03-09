package net.mcreator.oasiscore.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

import net.mcreator.oasiscore.network.OasiscoreModVariables;

public class AmbiencePlayerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double AmbientSelector = 0;
		{
			OasiscoreModVariables.PlayerVariables _vars = entity.getData(OasiscoreModVariables.PLAYER_VARIABLES);
			_vars.untilmusic = Math.random();
			_vars.syncPlayerVariables(entity);
		}
		if (entity.getData(OasiscoreModVariables.PLAYER_VARIABLES).untilmusic <= 1 && entity.getData(OasiscoreModVariables.PLAYER_VARIABLES).untilmusic > 0.75) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("oasiscore:memoriaambient")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("oasiscore:memoriaambient")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
		}
		if (entity.getData(OasiscoreModVariables.PLAYER_VARIABLES).untilmusic <= 0.75 && entity.getData(OasiscoreModVariables.PLAYER_VARIABLES).untilmusic > 0.5) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("oasiscore:memoriaambient")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("oasiscore:memoriaambient")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
		}
		if (entity.getData(OasiscoreModVariables.PLAYER_VARIABLES).untilmusic <= 0.5 && entity.getData(OasiscoreModVariables.PLAYER_VARIABLES).untilmusic > 0.25) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("oasiscore:memoriaambient")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("oasiscore:memoriaambient")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
		}
		if (entity.getData(OasiscoreModVariables.PLAYER_VARIABLES).untilmusic <= 0.25 && entity.getData(OasiscoreModVariables.PLAYER_VARIABLES).untilmusic >= 0) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("oasiscore:memoriaambient")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("oasiscore:memoriaambient")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
		}
	}
}
