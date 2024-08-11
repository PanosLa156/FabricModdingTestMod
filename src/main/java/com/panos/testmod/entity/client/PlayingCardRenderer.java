package com.panos.testmod.entity.client;

import com.panos.testmod.PanosTestMod;
import com.panos.testmod.entity.custom.PlayingCardEntity;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.client.render.entity.model.TridentEntityModel;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.projectile.TridentEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Position;
import net.minecraft.util.math.RotationAxis;

public class PlayingCardRenderer extends EntityRenderer<PlayingCardEntity> {
    private static final Identifier TEXTURE = PanosTestMod.id("textures/entity/playing_card_texture.png");
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
        VertexConsumer vertexConsumer = ItemRenderer.getDirectItemGlintConsumer(
                vertexConsumerProvider, this.model.getLayer(this.getTexture(playingCardEntity)), false, false
        );
        this.model.render(matrixStack, vertexConsumer, i, OverlayTexture.DEFAULT_UV);
        matrixStack.pop();
        super.render(playingCardEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }

    @Override
    public Identifier getTexture(PlayingCardEntity entity) {
        return TEXTURE;
    }
}/*

package com.panos.testmod.entity.client;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.render.model.json.ModelTransformationMode;
import net.minecraft.client.texture.SpriteAtlasTexture;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.entity.FlyingItemEntity;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import com.panos.testmod.PanosTestMod;

@Environment(EnvType.CLIENT)
public class PlayingCardRenderer<T extends PersistentProjectileEntity & Entity> extends EntityRenderer<T> {

    public static final Identifier TEXTURE = PanosTestMod.id("textures/entity/playing_card_texture.png");

    public static final float MIN_DISTANCE = 12.25F;
    public final ItemRenderer itemRenderer;
    public final float scale;
    public final boolean lit;

    public PlayingCardRenderer(EntityRendererFactory.Context ctx, ItemRenderer itemRenderer, float scale, boolean lit, ItemRenderer itemRenderer1, float scale1, boolean lit1) {
        super(ctx);
        this.itemRenderer = itemRenderer1;
        this.scale = scale1;
        this.lit = lit1;
    }


    @Override
    protected int getBlockLight(T entity, BlockPos pos) {
        return this.lit ? 15 : super.getBlockLight(entity, pos);
    }

    @Override
    public void render(T entity, float yaw, float tickDelta, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light) {
        if (entity.age >= 2 || !(this.dispatcher.camera.getFocusedEntity().squaredDistanceTo(entity) < 12.25)) {
            matrices.push();
            matrices.scale(this.scale, this.scale, this.scale);
            matrices.multiply(this.dispatcher.getRotation());
            this.itemRenderer
                    .renderItem(
                            entity.getStack(), ModelTransformationMode.FIXED, light, OverlayTexture.DEFAULT_UV, matrices, vertexConsumers, entity.getWorld(), entity.getId()
                    );
            matrices.pop();
            super.render(entity, yaw, tickDelta, matrices, vertexConsumers, light);
        }
    }

    @Override
    public Identifier getTexture(T entity) {
        return TEXTURE;
    }
}*/