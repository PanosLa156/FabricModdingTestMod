// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class PlayingCardModel extends EntityModel<Entity> {
	private final ModelPart CardGroup;
	public PlayingCardModel(ModelPart root) {
		this.CardGroup = root.getChild("CardGroup");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData CardGroup = modelPartData.addChild("CardGroup", ModelPartBuilder.create().uv(0, 0).cuboid(-3.0F, -1.0F, -4.0F, 6.0F, 1.0F, 8.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 24.0F, 0.0F));
		return TexturedModelData.of(modelData, 32, 32);
	}
	@Override
	public void setAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		CardGroup.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}
}