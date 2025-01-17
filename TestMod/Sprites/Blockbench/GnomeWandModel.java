// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class GnomeWand extends EntityModel<Entity> {
	private final ModelPart bb_main;
	public GnomeWand(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData bb_main = modelPartData.addChild("bb_main", ModelPartBuilder.create().uv(0, 11).cuboid(-1.0F, -9.0F, -1.0F, 2.0F, 9.0F, 2.0F, new Dilation(0.0F))
		.uv(8, 0).cuboid(0.0F, -17.0F, -1.0F, 2.0F, 9.0F, 2.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(0.0F, -23.0F, 0.0F, 2.0F, 9.0F, 2.0F, new Dilation(0.0F))
		.uv(8, 11).cuboid(-1.0F, -29.0F, 0.0F, 2.0F, 7.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 24.0F, 0.0F));
		return TexturedModelData.of(modelData, 32, 32);
	}
	@Override
	public void setAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		bb_main.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}
}