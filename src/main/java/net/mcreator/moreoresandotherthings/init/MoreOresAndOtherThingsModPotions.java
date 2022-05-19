
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.moreoresandotherthings.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.moreoresandotherthings.MoreOresAndOtherThingsMod;

public class MoreOresAndOtherThingsModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, MoreOresAndOtherThingsMod.MODID);
	public static final RegistryObject<Potion> BLO = REGISTRY.register("blo",
			() -> new Potion(new MobEffectInstance(MobEffects.HEALTH_BOOST, 3600, 0, false, true),
					new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 3600, 0, false, true),
					new MobEffectInstance(MobEffects.DIG_SPEED, 3600, 0, false, true)));
}
