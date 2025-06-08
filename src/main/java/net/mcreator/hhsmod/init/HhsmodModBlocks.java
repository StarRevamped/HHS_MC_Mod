
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.hhsmod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

import net.mcreator.hhsmod.block.IasonasBlockBlock;
import net.mcreator.hhsmod.HhsmodMod;

public class HhsmodModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(HhsmodMod.MODID);
	public static final DeferredBlock<Block> IASONAS_BLOCK = REGISTRY.register("iasonas_block", IasonasBlockBlock::new);
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
