
package net.mcreator.hhsmod.item;

import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;

import net.mcreator.hhsmod.procedures.IasonasGemItemIsDroppedByPlayerProcedure;

public class IasonasGemItem extends Item {
	public IasonasGemItem() {
		super(new Item.Properties().stacksTo(17).rarity(Rarity.COMMON));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}

	@Override
	public boolean onDroppedByPlayer(ItemStack itemstack, Player entity) {
		IasonasGemItemIsDroppedByPlayerProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
		return true;
	}
}
