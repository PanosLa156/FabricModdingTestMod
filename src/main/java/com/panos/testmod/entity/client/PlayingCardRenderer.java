package com.panos.testmod.entity.client;

import com.panos.testmod.PanosTestMod;
import com.panos.testmod.entity.custom.PlayingCardEntity;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RotationAxis;

public class PlayingCardRenderer extends EntityRenderer<PlayingCardEntity> {
    private static final Identifier TEXTURE_BLACK = PanosTestMod.id("textures/entity/playing_card_texture.png");
    private static final Identifier TEXTURE_RED = PanosTestMod.id("textures/entity/playing_card_texture_red.png");


    private final PlayingCardModel model;

    public PlayingCardRenderer(EntityRendererFactory.Context context) {
        super(context);
        this.model = new PlayingCardModel<>(context.getPart(ModModelLayers.PLAYING_CARD));
    }

    public void render(PlayingCardEntity playingCardEntity, float f, float g, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i) {
        matrixStack.push();
        //matrixStack.multiply(RotationAxis.);
        matrixStack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(MathHelper.lerp(g, playingCardEntity.prevYaw, playingCardEntity.getYaw())));
        matrixStack.multiply(RotationAxis.POSITIVE_X.rotationDegrees(MathHelper.lerp(g, playingCardEntity.prevPitch, playingCardEntity.getPitch()) * (-1.0F)));
        //matrixStack.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(180.0F * Math.round(Math.random()));
        VertexConsumer vertexConsumer = ItemRenderer.getDirectItemGlintConsumer(
                vertexConsumerProvider, this.model.getLayer(this.getTexture(playingCardEntity)), false, false
        );
        this.model.render(matrixStack, vertexConsumer, i, OverlayTexture.DEFAULT_UV);
        matrixStack.pop();
        super.render(playingCardEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }

    @Override
    public Identifier getTexture(PlayingCardEntity entity) {
        /*double randomNum = Math.round(Math.random());
        if(randomNum == 1) {
            return TEXTURE_BLACK;
        }*/
            return TEXTURE_BLACK;
    }
}