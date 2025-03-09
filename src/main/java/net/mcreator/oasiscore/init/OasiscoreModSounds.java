
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.oasiscore.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import net.mcreator.oasiscore.OasiscoreMod;

public class OasiscoreModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(Registries.SOUND_EVENT, OasiscoreMod.MODID);
	public static final DeferredHolder<SoundEvent, SoundEvent> MEMORIAAMBIENT = REGISTRY.register("memoriaambient", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("oasiscore", "memoriaambient")));
}
