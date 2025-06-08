
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.hhsmod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

import net.minecraft.world.item.Item;

import net.mcreator.hhsmod.item.IasonasGemItem;
import net.mcreator.hhsmod.HhsmodMod;

public class HhsmodModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(HhsmodMod.MODID);
	public static final DeferredItem<Item> IASONAS_GEM = REGISTRY.register("iasonas_gem", IasonasGemItem::new);
	// Start of user code block custom items
	// End of user code block custom items
}
