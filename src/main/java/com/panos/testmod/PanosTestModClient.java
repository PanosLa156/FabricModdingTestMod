package com.panos.testmod;

import com.panos.testmod.block.ModBlocks;
import com.panos.testmod.entity.ModEntities;
import com.panos.testmod.entity.client.ModModelLayers;
import com.panos.testmod.entity.client.NautilusModel;
import com.panos.testmod.entity.client.NautilusRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.particle.FlameParticle;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.entity.FlyingItemEntityRenderer;

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
        EntityRendererRegistry.register(ModEntities.NAUTILUS, NautilusRenderer::new);

        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.NAUTILUS, NautilusModel::getTexturedModelData);
        //EntityRendererRegistry.INSTANCE.register(ModEntities.NAUTILUS, (entityRenderDispatcher, context) -> new NautilusRenderer(entityRenderDispatcher));
    }
}
