
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.moreoresandotherthings.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.moreoresandotherthings.block.PowerOreBlock;
import net.mcreator.moreoresandotherthings.block.NuclearTNTBlock;
import net.mcreator.moreoresandotherthings.block.NuclearOreBlock;
import net.mcreator.moreoresandotherthings.block.BlackOOreBlock;
import net.mcreator.moreoresandotherthings.MoreOresAndOtherThingsMod;

public class MoreOresAndOtherThingsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MoreOresAndOtherThingsMod.MODID);
	public static final RegistryObject<Block> POWER_ORE = REGISTRY.register("power_ore", () -> new PowerOreBlock());
	public static final RegistryObject<Block> NUCLEAR_ORE = REGISTRY.register("nuclear_ore", () -> new NuclearOreBlock());
	public static final RegistryObject<Block> NUCLEAR_TNT = REGISTRY.register("nuclear_tnt", () -> new NuclearTNTBlock());
	public static final RegistryObject<Block> BLACK_O_ORE = REGISTRY.register("black_o_ore", () -> new BlackOOreBlock());
}
