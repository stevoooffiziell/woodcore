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

    /**TODO: Add the missing textures and ore blocks listed below! Those items will have a special functionality later on!
     * JADE             ore/block texture       drops jade gem needs to be crafted to grinded jade gem -> crafted together with iron ingot -> jade ingot
     * PSIONIC          block texture           psionic needs to be melted down to a psionic ingot
     * AQUATIC          ore/block texture       -"-
     * AQUATIC REDSTONE ore/block texture       aquatic and redstone ingot needs to be crafted together -> 2 redstone 1 aquatic
     * REDSTONE         ore/block texture       needs to be crafted in 2x2 to compressed redstone -> melted to redstone ingot
     * JADE GOLD        ore/block texture       two jade gems and one gold -> 2 jade ingots...
    **/

    // new Block = just a block / new DropExperienceBlock = drops experience when mined

    // This block drops experience when mined. It drops between 3 and 7 xp orbs.
    public static final RegistryObject<Block> ORE_JADE = registerBlock("ore_jade",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops(),
                    UniformInt.of(3,7)), WoodCoreTab.WoodCoreTab);
    public static final RegistryObject<Block> ORE_PSIONIC = registerBlock("ore_psionic",
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
