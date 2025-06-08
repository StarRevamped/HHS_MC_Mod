
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.hhsmod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.hhsmod.item.YardStickItem;
import net.mcreator.hhsmod.item.IasonasGemItem;
import net.mcreator.hhsmod.item.ChildSoulItem;
import net.mcreator.hhsmod.HhsmodMod;

public class HhsmodModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(HhsmodMod.MODID);
	public static final DeferredItem<Item> IASONAS_GEM = REGISTRY.register("iasonas_gem", IasonasGemItem::new);
	public static final DeferredItem<Item> IASONAS_BLOCK = block(HhsmodModBlocks.IASONAS_BLOCK);
	public static final DeferredItem<Item> AJAY_SISCONE_SPAWN_EGG = REGISTRY.register("ajay_siscone_spawn_egg", () -> new DeferredSpawnEggItem(HhsmodModEntities.AJAY_SISCONE, -6749953, -3368449, new Item.Properties()));
	public static final DeferredItem<Item> YARD_STICK = REGISTRY.register("yard_stick", YardStickItem::new);
	public static final DeferredItem<Item> CHILD_SOUL = REGISTRY.register("child_soul", ChildSoulItem::new);

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
