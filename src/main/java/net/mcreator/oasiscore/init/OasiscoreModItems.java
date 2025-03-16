
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.oasiscore.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.oasiscore.item.OofItem;
import net.mcreator.oasiscore.item.MemoriaItem;
import net.mcreator.oasiscore.OasiscoreMod;

public class OasiscoreModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(OasiscoreMod.MODID);
	public static final DeferredItem<Item> OOF = REGISTRY.register("oof", OofItem::new);
	public static final DeferredItem<Item> MEMORIA = REGISTRY.register("memoria", MemoriaItem::new);
	public static final DeferredItem<Item> MEME_STONE = block(OasiscoreModBlocks.MEME_STONE);
	public static final DeferredItem<Item> MEMORIA_SOYJAK_SPAWN_EGG = REGISTRY.register("memoria_soyjak_spawn_egg", () -> new DeferredSpawnEggItem(OasiscoreModEntities.MEMORIA_SOYJAK, -1, -6710887, new Item.Properties()));
	public static final DeferredItem<Item> RICK_ASTLEY_BOSS_SPAWN_EGG = REGISTRY.register("rick_astley_boss_spawn_egg", () -> new DeferredSpawnEggItem(OasiscoreModEntities.RICK_ASTLEY_BOSS, -64251, -10066330, new Item.Properties()));

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
