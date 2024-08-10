package com.panos.testmod;

import com.panos.testmod.block.ModBlocks;
import com.panos.testmod.entity.ModEntities;
import com.panos.testmod.entity.client.*;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.particle.FlameParticle;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.entity.FlyingItemEntityRenderer;
import net.minecraft.client.render.entity.feature.ElytraFeatureRenderer;

public class PanosTestModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.COPPER_TORCH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ENDER_TORCH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.COPPER_LANTERN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ENDER_LANTERN, RenderLayer.getCutout());
        ParticleFactoryRegistry.getInstance().register(PanosTestMod.COPPER_FLAME, FlameParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(PanosTestMod.ENDER_FLAME, FlameParticle.Factory::new);

        EntityRendererRegistry.register(ModEntities.SMALL_EXP_BOTTLE, FlyingItemEntityRenderer::new);
        EntityRendererRegistry.register(ModEntities.MEDIUM_EXP_BOTTLE, FlyingItemEntityRenderer::new);
        EntityRendererRegistry.register(ModEntities.LARGE_EXP_BOTTLE, FlyingItemEntityRenderer::new);
        EntityRendererRegistry.register(ModEntities.GRAND_EXP_BOTTLE, FlyingItemEntityRenderer::new);

        EntityRendererRegistry.register(ModEntities.PLAYING_CARD, PlayingCardRenderer::new);

        EntityRendererRegistry.register(ModEntities.NAUTILUS, NautilusRenderer::new);
        EntityRendererRegistry.register(ModEntities.GNOME, GnomeRenderer::new);

        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.NAUTILUS, NautilusModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.GNOME, GnomeModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.PLAYING_CARD, GnomeModel::getTexturedModelData);
    }
}
