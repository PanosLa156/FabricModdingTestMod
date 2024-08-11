package com.panos.testmod.entity.client;

import com.panos.testmod.PanosTestMod;
import com.panos.testmod.entity.custom.NautilusEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class NautilusRenderer extends MobEntityRenderer<NautilusEntity, NautilusModel<NautilusEntity>> {
    public static final Identifier TEXTURE = PanosTestMod.id("textures/entity/nautilus.png");

    public NautilusRenderer(EntityRendererFactory.Context context) {
        super(context, new NautilusModel<>(context.getPart(ModModelLayers.NAUTILUS)), 0.6f);
    }

    @Override
    public Identifier getTexture(NautilusEntity entity) {
        return TEXTURE;
    }

    @Override
    public void render(NautilusEntity livingEntity, float f, float g, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i) {

        if(livingEntity.isBaby())
        {
            matrixStack.scale(0.5f,0.5f,0.5f);
        }
        else
        {
            matrixStack.scale(1f,1f,1f);
        }

        super.render(livingEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}