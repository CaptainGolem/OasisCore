
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.oasiscore.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

import net.minecraft.world.item.Item;

import net.mcreator.oasiscore.item.OofItem;
import net.mcreator.oasiscore.OasiscoreMod;

public class OasiscoreModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(OasiscoreMod.MODID);
	public static final DeferredItem<Item> OOF = REGISTRY.register("oof", OofItem::new);
	// Start of user code block custom items
	// End of user code block custom items
}
