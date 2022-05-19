
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.moreoresandotherthings.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.moreoresandotherthings.item.PowerSwordItem;
import net.mcreator.moreoresandotherthings.item.PowerShovelItem;
import net.mcreator.moreoresandotherthings.item.PowerPickaxeItem;
import net.mcreator.moreoresandotherthings.item.PowerIngotItem;
import net.mcreator.moreoresandotherthings.item.PowerAxeItem;
import net.mcreator.moreoresandotherthings.item.PhItem;
import net.mcreator.moreoresandotherthings.item.ObsidianhammerItem;
import net.mcreator.moreoresandotherthings.item.NuclearDustItem;
import net.mcreator.moreoresandotherthings.item.NetheritehammerItem;
import net.mcreator.moreoresandotherthings.item.NeclearfuelItem;
import net.mcreator.moreoresandotherthings.item.IronhammerItem;
import net.mcreator.moreoresandotherthings.item.GoldhammerItem;
import net.mcreator.moreoresandotherthings.item.DiamondhammerItem;
import net.mcreator.moreoresandotherthings.item.BlackoItem;
import net.mcreator.moreoresandotherthings.item.BlackOIngotItem;
import net.mcreator.moreoresandotherthings.item.Black0Item;
import net.mcreator.moreoresandotherthings.item.Black0AxeItem;
import net.mcreator.moreoresandotherthings.MoreOresAndOtherThingsMod;

public class MoreOresAndOtherThingsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MoreOresAndOtherThingsMod.MODID);
	public static final RegistryObject<Item> POWER_INGOT = REGISTRY.register("power_ingot", () -> new PowerIngotItem());
	public static final RegistryObject<Item> POWER_ORE = block(MoreOresAndOtherThingsModBlocks.POWER_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> POWER_PICKAXE = REGISTRY.register("power_pickaxe", () -> new PowerPickaxeItem());
	public static final RegistryObject<Item> POWER_AXE = REGISTRY.register("power_axe", () -> new PowerAxeItem());
	public static final RegistryObject<Item> POWER_SWORD = REGISTRY.register("power_sword", () -> new PowerSwordItem());
	public static final RegistryObject<Item> POWER_SHOVEL = REGISTRY.register("power_shovel", () -> new PowerShovelItem());
	public static final RegistryObject<Item> NUCLEAR_DUST = REGISTRY.register("nuclear_dust", () -> new NuclearDustItem());
	public static final RegistryObject<Item> NUCLEAR_ORE = block(MoreOresAndOtherThingsModBlocks.NUCLEAR_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> NUCLEAR_TNT = block(MoreOresAndOtherThingsModBlocks.NUCLEAR_TNT, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> PH = REGISTRY.register("ph", () -> new PhItem());
	public static final RegistryObject<Item> NECLEARFUEL = REGISTRY.register("neclearfuel", () -> new NeclearfuelItem());
	public static final RegistryObject<Item> BLACK_O_INGOT = REGISTRY.register("black_o_ingot", () -> new BlackOIngotItem());
	public static final RegistryObject<Item> BLACK_O_ORE = block(MoreOresAndOtherThingsModBlocks.BLACK_O_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> BLACKO_PICKAXE = REGISTRY.register("blacko_pickaxe", () -> new BlackoItem());
	public static final RegistryObject<Item> BLACK_0_AXE = REGISTRY.register("black_0_axe", () -> new Black0AxeItem());
	public static final RegistryObject<Item> BLACKOORE = REGISTRY.register("blackoore", () -> new Black0Item());
	public static final RegistryObject<Item> IRONHAMMER = REGISTRY.register("ironhammer", () -> new IronhammerItem());
	public static final RegistryObject<Item> GOLDHAMMER = REGISTRY.register("goldhammer", () -> new GoldhammerItem());
	public static final RegistryObject<Item> DIAMONDHAMMER = REGISTRY.register("diamondhammer", () -> new DiamondhammerItem());
	public static final RegistryObject<Item> NETHERITEHAMMER = REGISTRY.register("netheritehammer", () -> new NetheritehammerItem());
	public static final RegistryObject<Item> OBSIDIANHAMMER = REGISTRY.register("obsidianhammer", () -> new ObsidianhammerItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
