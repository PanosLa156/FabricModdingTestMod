package com.panos.testmod.entity.client;

import com.panos.testmod.PanosTestMod;
import com.panos.testmod.entity.custom.GnomeEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class GnomeRenderer extends MobEntityRenderer<GnomeEntity, GnomeModel<GnomeEntity>> {
    public static final Identifier TEXTURE = PanosTestMod.id("textures/entity/gnome.png");

    public GnomeRenderer(EntityRendererFactory.Context context) {
        super(context, new GnomeModel<>(context.getPart(ModModelLayers.GNOME)), 0.75f);
    }

    @Override
    public Identifier getTexture(GnomeEntity entity) {
        return TEXTURE;
    }

    @Override
    public void render(GnomeEntity livingEntity, float f, float g, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i) {
        super.render(livingEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}
