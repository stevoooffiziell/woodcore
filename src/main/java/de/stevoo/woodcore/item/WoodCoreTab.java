package de.stevoo.woodcore.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class WoodCoreTab {
    public static final CreativeModeTab WoodCoreTab = new CreativeModeTab("WoodCoreTab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.INGOT_JADE.get());
        }
    };
}
