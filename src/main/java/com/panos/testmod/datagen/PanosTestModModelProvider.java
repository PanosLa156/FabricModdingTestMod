package com.panos.testmod.datagen;

import com.panos.testmod.PanosTestMod;
import com.panos.testmod.block.ModBlocks;
import com.panos.testmod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Model;
import net.minecraft.data.client.Models;

import java.util.Optional;

public class PanosTestModModelProvider extends FabricModelProvider {
    public PanosTestModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLUE_WOOD_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WHITE_COBBLESTONE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEADWOOD_PLANKS);
        blockStateModelGenerator.registerLog(ModBlocks.DEADWOOD_LOG).log(ModBlocks.DEADWOOD_LOG).wood(ModBlocks.DEADWOOD_WOOD);
        //blockStateModelGenerator.registerLog(ModBlocks.DEADWOOD_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_DEADWOOD_LOG).log(ModBlocks.STRIPPED_DEADWOOD_LOG).wood(ModBlocks.STRIPPED_DEADWOOD_WOOD);
        //blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_DEADWOOD_WOOD);

        blockStateModelGenerator.registerLantern(ModBlocks.COPPER_LANTERN);
        blockStateModelGenerator.registerLantern(ModBlocks.ENDER_LANTERN);

        blockStateModelGenerator.registerTorch(ModBlocks.COPPER_TORCH, ModBlocks.WALL_COPPER_TORCH);
        blockStateModelGenerator.registerTorch(ModBlocks.ENDER_TORCH, ModBlocks.WALL_ENDER_TORCH);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.SMALL_EXP_BOTTLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.MEDIUM_EXP_BOTTLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.LARGE_EXP_BOTTLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.GRAND_EXP_BOTTLE, Models.GENERATED);

        itemModelGenerator.register(ModItems.PLAYING_CARD, Models.GENERATED);

        itemModelGenerator.register(ModItems.VODKA, Models.GENERATED);
        itemModelGenerator.register(ModItems.WITHERED_BONE, Models.GENERATED);
        itemModelGenerator.register(ModItems.RUBY, Models.GENERATED);
        itemModelGenerator.register(ModItems.DRAGON_ELYTRA, Models.GENERATED);
        itemModelGenerator.register(ModItems.NAUTILUS_SPAWN_EGG,
                new Model(Optional.of(PanosTestMod.id("item/template_spawn_egg")), Optional.empty()));
    }

}
