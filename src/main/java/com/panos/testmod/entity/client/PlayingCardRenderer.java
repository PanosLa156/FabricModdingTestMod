package com.panos.testmod.entity.client;

import com.panos.testmod.PanosTestMod;
import com.panos.testmod.entity.custom.PlayingCardEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.ProjectileEntityRenderer;
import net.minecraft.util.Identifier;


public class PlayingCardRenderer extends ProjectileEntityRenderer<PlayingCardEntity> {
    private static final Identifier TEXTURE = PanosTestMod.id("textures/entity/playing_card_texture.png");
    public PlayingCardRenderer(EntityRendererFactory.Context context) {
        super(context);
    }

    @Override
    public Identifier getTexture(PlayingCardEntity entity) {
        return TEXTURE;
    }
}
    /*private static final Identifier TEXTURE = PanosTestMod.id("textures/entity/playing_card_texture.png");

    public PlayingCardRenderer(EntityRendererFactory.Context context) {
        super(context, new NautilusModel<>(context.getPart(ModModelLayers.NAUTILUS)), 0.6f);
    }

    @Override
    public Identifier getTexture(ArrowEntity entity) {
        return TEXTURE;
    }

    @Override
    public void render(ArrowEntity persistentProjectileEntity, float f, float g, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i) {
        super.render(persistentProjectileEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
*/