
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.moreoresandotherthings.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;

@Mod.EventBusSubscriber
public class MoreOresAndOtherThingsModFuels {
	@SubscribeEvent
	public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == MoreOresAndOtherThingsModItems.NECLEARFUEL.get())
			event.setBurnTime(4000);
	}
}
