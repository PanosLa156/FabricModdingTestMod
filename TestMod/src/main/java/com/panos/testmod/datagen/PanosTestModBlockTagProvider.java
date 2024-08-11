package com.panos.testmod.datagen;

import com.panos.testmod.PanosTestMod;
import com.panos.testmod.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class PanosTestModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public PanosTestModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.WHITE_COBBLESTONE)
                .add(ModBlocks.DEADWOOD_LOG)
                .add(ModBlocks.DEADWOOD_WOOD)
                .add(ModBlocks.DEADWOOD_PLANKS)
                .add(ModBlocks.STRIPPED_DEADWOOD_LOG)
                .add(ModBlocks.STRIPPED_DEADWOOD_WOOD)
                .add(ModBlocks.COPPER_LANTERN)
                .add(ModBlocks.ENDER_LANTERN);

        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(ModBlocks.BLUE_WOOD_PLANKS);

        /*getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, Identifier.of("fabric", "DEADWOOD_LOGS")))
                .add(ModBlocks.DEADWOOD_LOG)
                .add(ModBlocks.DEADWOOD_WOOD)
                .add(ModBlocks.STRIPPED_DEADWOOD_LOG)
                .add(ModBlocks.STRIPPED_DEADWOOD_WOOD);*/
    }
}
