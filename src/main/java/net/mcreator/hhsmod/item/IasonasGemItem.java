
package net.mcreator.hhsmod.item;

public class IasonasGemItem extends Item {
	public IasonasGemItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}

	@Override
	public boolean onDroppedByPlayer(ItemStack itemstack, Player entity) {
		IasonasGemItemIsDroppedByPlayerProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ());
		return true;
	}
}