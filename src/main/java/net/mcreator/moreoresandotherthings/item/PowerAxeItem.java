
package net.mcreator.moreoresandotherthings.item;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.AxeItem;

import net.mcreator.moreoresandotherthings.init.MoreOresAndOtherThingsModItems;

public class PowerAxeItem extends AxeItem {
	public PowerAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 1500;
			}

			public float getSpeed() {
				return 60f;
			}

			public float getAttackDamageBonus() {
				return 2f;
			}

			public int getLevel() {
				return 40;
			}

			public int getEnchantmentValue() {
				return 85;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(MoreOresAndOtherThingsModItems.PH.get()));
			}
		}, 1, -1f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}
