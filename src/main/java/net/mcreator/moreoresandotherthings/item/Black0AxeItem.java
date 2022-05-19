
package net.mcreator.moreoresandotherthings.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.AxeItem;

import net.mcreator.moreoresandotherthings.init.MoreOresAndOtherThingsModItems;

public class Black0AxeItem extends AxeItem {
	public Black0AxeItem() {
		super(new Tier() {
			public int getUses() {
				return 60;
			}

			public float getSpeed() {
				return 800f;
			}

			public float getAttackDamageBonus() {
				return -1f;
			}

			public int getLevel() {
				return 800;
			}

			public int getEnchantmentValue() {
				return 800;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(MoreOresAndOtherThingsModItems.BLACK_O_INGOT.get()));
			}
		}, 1, -3f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS));
	}
}
