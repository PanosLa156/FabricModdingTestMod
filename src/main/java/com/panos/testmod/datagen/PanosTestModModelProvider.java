package com.panos.testmod.datagen;

import com.panos.testmod.PanosTestMod;
import com.panos.testmod.block.ModBlocks;
import com.panos.testmod.entity.ModEntities;
import com.panos.testmod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Model;
import net.minecraft.data.client.Models;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

import java.util.Optional;

public class PanosTestModModelProvider extends FabricModelProvider {
    public PanosTestModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLUE_WOOD_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WHITE_COBBLESTONE);
        blockStateModelGenerator.registerLantern(ModBlocks.COPPER_LANTERN);
        blockStateModelGenerator.registerLantern(ModBlocks.ENDER_LANTERN);
        blockStateModelGenerator.registerTorch(ModBlocks.COPPER_TORCH, ModBlocks.WALL_COPPER_TORCH);
        blockStateModelGenerator.registerTorch(ModBlocks.ENDER_TORCH, ModBlocks.WALL_ENDER_TORCH);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.SMALL_EXP_BOTTLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.VODKA, Models.GENERATED);
        itemModelGenerator.register(ModItems.WITHERED_BONE, Models.GENERATED);
        itemModelGenerator.register(ModItems.NAUTILUS_SPAWN_EGG,
                new Model(Optional.of(PanosTestMod.id("item/template_spawn_egg")), Optional.empty()));
    }

}
