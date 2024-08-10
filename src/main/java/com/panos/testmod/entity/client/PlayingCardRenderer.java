package com.panos.testmod.entity.client;

import com.panos.testmod.PanosTestMod;
import com.panos.testmod.entity.custom.PlayingCardEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.ProjectileEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.projectile.ArrowEntity;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.util.Identifier;

public class PlayingCardRenderer extends ProjectileEntityRenderer<ArrowEntity> {

    private static final Identifier TEXTURE = PanosTestMod.id("textures/entity/playing_card_texture.png");
    public PlayingCardRenderer(EntityRendererFactory.Context context) {
        super(context);
    }

    @Override
    public Identifier getTexture(ArrowEntity entity) {
        return TEXTURE;
    }

    @Override
    public void render(ArrowEntity persistentProjectileEntity, float f, float g, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i) {
        super.render(persistentProjectileEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}
