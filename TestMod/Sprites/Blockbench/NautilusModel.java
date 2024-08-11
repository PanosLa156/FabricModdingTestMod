// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class NautilusModel extends EntityModel<Entity> {
	private final ModelPart nautilus;
	private final ModelPart shell;
	private final ModelPart bone2;
	public NautilusModel(ModelPart root) {
		this.nautilus = root.getChild("nautilus");
		this.shell = root.getChild("shell");
		this.bone2 = root.getChild("bone2");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData nautilus = modelPartData.addChild("nautilus", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData shell = nautilus.addChild("shell", ModelPartBuilder.create().uv(19, 11).cuboid(-3.0F, -10.0F, -4.0F, 6.0F, 6.0F, 3.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-3.0F, -10.0F, -1.0F, 6.0F, 9.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -3.1416F, 0.0F, 3.1416F));

		ModelPartData bone2 = nautilus.addChild("bone2", ModelPartBuilder.create(), ModelTransform.of(0.0F, -4.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData cube_r1 = bone2.addChild("cube_r1", ModelPartBuilder.create().uv(0, 14).cuboid(-2.0F, -3.0F, -3.1F, 4.0F, 4.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 2.75F, -2.9F, 0.3927F, 0.0F, 0.0F));
		return TexturedModelData.of(modelData, 64, 64);
	}
	@Override
	public void setAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		nautilus.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}
}