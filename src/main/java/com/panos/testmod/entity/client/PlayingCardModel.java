package com.panos.testmod.entity.client;

import com.panos.testmod.entity.custom.PlayingCardEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class PlayingCardModel<T extends PlayingCardEntity> extends SinglePartEntityModel<T> {
	private final ModelPart CardGroup;
	public PlayingCardModel(ModelPart root) {
		this.CardGroup = root.getChild("CardGroup");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData CardGroup = modelPartData.addChild("CardGroup", ModelPartBuilder.create().uv(0, 0).cuboid(-3.0F, -20.0F, -4.0F, 6.0F, 1.0F, 8.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 24.0F, 0.0F));
		return TexturedModelData.of(modelData, 32, 32);
	}

	@Override
	public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, int color) {
		CardGroup.render(matrices, vertices, light, overlay, color);
	}

	@Override
	public ModelPart getPart() {
		return CardGroup;
	}

	@Override
	public void setAngles(T entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {

	}
}