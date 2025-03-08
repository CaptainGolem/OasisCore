
package net.mcreator.oasiscore.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class OofItem extends Item {
	public OofItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
