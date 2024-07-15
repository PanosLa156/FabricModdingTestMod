package com.panos.testmod.block;

import com.panos.testmod.PanosTestMod;
import com.panos.testmod.item.ModItems;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.particle.SimpleParticleType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class ModBlocks {
    public static final Block WHITE_COBBLESTONE = registerWithItem("white_cobblestone",
            new Block(AbstractBlock.Settings.copy(Blocks.COBBLESTONE)));

    public static final Block BLUE_WOOD_PLANKS = registerWithItem("blue_wood_planks",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));

    public static final Block COPPER_LANTERN = registerWithItem("copper_lantern",
            new LanternBlock(LanternBlock.Settings.copy(Blocks.LANTERN)));

    public static final Block ENDER_LANTERN = registerWithItem("ender_lantern",
            new LanternBlock(LanternBlock.Settings.copy(Blocks.LANTERN)));

    public static final Block COPPER_TORCH = registerWithItem("copper_torch",
            new TorchBlock(PanosTestMod.COPPER_FLAME, AbstractBlock.Settings.copy(Blocks.TORCH)));

    public static final Block ENDER_TORCH = registerWithItem("ender_torch",
            new TorchBlock(PanosTestMod.ENDER_FLAME, TorchBlock.Settings.copy(Blocks.TORCH)));

    public static final Block WALL_COPPER_TORCH = registerWithItem("wall_copper_torch",
            new WallTorchBlock(ParticleTypes.SOUL_FIRE_FLAME, AbstractBlock.Settings.copy(Blocks.TORCH)));

    public static final Block WALL_ENDER_TORCH = registerWithItem("wall_ender_lantern",
            new WallTorchBlock(ParticleTypes.SOUL_FIRE_FLAME, TorchBlock.Settings.copy(Blocks.TORCH)));

    public static final Block DEADWOOD_LOG = registerWithItem("deadwood_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.COBBLESTONE)));

    public static final Block STRIPPED_DEADWOOD_LOG = registerWithItem("stripped_deadwood_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.COBBLESTONE)));

    public static final Block DEADWOOD_WOOD = registerWithItem("deadwood_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.COBBLESTONE)));

    public static final Block STRIPPED_DEADWOOD_WOOD = registerWithItem("stripped_deadwood_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.COBBLESTONE)));

    public static final Block DEADWOOD_PLANKS = registerWithItem("deadwood_planks",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.COBBLESTONE)));

    public static <T extends Block> T register(String name, T block)
    {
        return Registry.register(Registries.BLOCK, PanosTestMod.id(name), block);
    }

    public static <T extends Block> T registerWithItem(String name, T block, Item.Settings settings)
    {
        T registered = register(name, block);
        ModItems.register(name, new BlockItem(registered, settings));
        return registered;
    }

    public static <T extends Block> T registerWithItem(String name, T block)
    {
        return registerWithItem(name, block, new Item.Settings());
    }

    public static void load() {}
}
