package com.panos.testmod.datagen;

import com.panos.testmod.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.fabricmc.fabric.api.resource.conditions.v1.ResourceCondition;
import net.minecraft.data.server.loottable.BlockLootTableGenerator;
import net.minecraft.loot.LootTable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;

public class PanosTestModLootTableProvider extends FabricBlockLootTableProvider {
    protected PanosTestModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.WHITE_COBBLESTONE);
        addDrop(ModBlocks.BLUE_WOOD_PLANKS);
        addDrop(ModBlocks.COPPER_LANTERN);
        addDrop(ModBlocks.COPPER_TORCH);
        addDrop(ModBlocks.ENDER_LANTERN);
        addDrop(ModBlocks.ENDER_TORCH);
    }

    @Override
    public BlockLootTableGenerator withConditions(ResourceCondition... conditions) {
        return super.withConditions(conditions);
    }

    @Override
    public BiConsumer<RegistryKey<LootTable>, LootTable.Builder> withConditions(BiConsumer<RegistryKey<LootTable>, LootTable.Builder> exporter, ResourceCondition... conditions) {
        return super.withConditions(exporter, conditions);
    }
}
