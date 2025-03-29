
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.oasiscore.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

import net.mcreator.oasiscore.block.RickAstleyBeaconBlock;
import net.mcreator.oasiscore.block.MemoriaPortalBlock;
import net.mcreator.oasiscore.block.MemeStoneBlock;
import net.mcreator.oasiscore.OasiscoreMod;

public class OasiscoreModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(OasiscoreMod.MODID);
	public static final DeferredBlock<Block> MEMORIA_PORTAL = REGISTRY.register("memoria_portal", MemoriaPortalBlock::new);
	public static final DeferredBlock<Block> MEME_STONE = REGISTRY.register("meme_stone", MemeStoneBlock::new);
	public static final DeferredBlock<Block> RICK_ASTLEY_BEACON = REGISTRY.register("rick_astley_beacon", RickAstleyBeaconBlock::new);
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
