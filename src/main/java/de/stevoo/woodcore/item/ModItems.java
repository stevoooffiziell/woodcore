package de.stevoo.woodcore.item;

import de.stevoo.woodcore.WoodCore;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, WoodCore.MOD_ID);

    public static final RegistryObject<Item> INGOT_JADE = ITEMS.register("ingot_jade",
            () -> new Item(new Item.Properties().tab(WoodCoreTab.WoodCoreTab)));
    public static final RegistryObject<Item> INGOT_PSIONIC_BASE = ITEMS.register("ingot_psionic_base",
            () -> new Item(new Item.Properties().tab(WoodCoreTab.WoodCoreTab)));
    public static final RegistryObject<Item> INGOT_PSIONIC = ITEMS.register("ingot_psionic",
            () -> new Item(new Item.Properties().tab(WoodCoreTab.WoodCoreTab)));
    public static final RegistryObject<Item> INGOT_JADE_GOLD = ITEMS.register("ingot_jade_gold",
            () -> new Item(new Item.Properties().tab(WoodCoreTab.WoodCoreTab)));
    public static final RegistryObject<Item> INGOT_REDSTONE = ITEMS.register("ingot_redstone",
            () -> new Item(new Item.Properties().tab(WoodCoreTab.WoodCoreTab)));
    public static final RegistryObject<Item> INGOT_AQUATIC = ITEMS.register("ingot_aquatic",
            () -> new Item(new Item.Properties().tab(WoodCoreTab.WoodCoreTab)));
    public static final RegistryObject<Item> INGOT_AQUATIC_REDSTONE = ITEMS.register("ingot_aquatic_redstone",
            () -> new Item(new Item.Properties().tab(WoodCoreTab.WoodCoreTab)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
