package de.stevoo.woodcore.block;

import de.stevoo.woodcore.WoodCore;
import de.stevoo.woodcore.item.ModItems;
import de.stevoo.woodcore.item.WoodCoreTab;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, WoodCore.MOD_ID);

    // new Block = just a block / new DropExperienceBlock = drops experience when mined

    // This block drops experience when mined. It drops between 3 and 7 xp orbs.
    public static final RegistryObject<Block> ORE_JADE = registerBlock("ore_jade",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops(),
                    UniformInt.of(3,7)), WoodCoreTab.WoodCoreTab);
    public static final RegistryObject<Block> ORE_PSIONIC = registerBlock("ore_psionic",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops(),
                    UniformInt.of(3,7)), WoodCoreTab.WoodCoreTab);
    public static final RegistryObject<Block> ORE_AQUATIC = registerBlock("ore_aquatic",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops(),
                    UniformInt.of(3,7)), WoodCoreTab.WoodCoreTab);

    public static final RegistryObject<Block> BLOCK_JADE = registerBlock("block_jade",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops()), WoodCoreTab.WoodCoreTab);
    public static final RegistryObject<Block> BLOCK_PSIONIC = registerBlock("block_psionic",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops()), WoodCoreTab.WoodCoreTab);
    public static final RegistryObject<Block> BLOCK_REDSTONE_MODDED = registerBlock("block_redstone_modded",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops()), WoodCoreTab.WoodCoreTab);
    public static final RegistryObject<Block> BLOCK_AQUATIC = registerBlock("block_aquatic",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops()), WoodCoreTab.WoodCoreTab);
    public static final RegistryObject<Block> BLOCK_AQUATIC_REDSTONE= registerBlock("block_aquatic_redstone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops()), WoodCoreTab.WoodCoreTab);
    public static final RegistryObject<Block> BLOCK_JADE_GOLD = registerBlock("block_jade_gold",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops()), WoodCoreTab.WoodCoreTab);



    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
